import pandas as pd
from sklearn.feature_extraction.text import CountVectorizer
from sklearn.ensemble import RandomForestClassifier
from sklearn.model_selection import cross_val_score
from sklearn.pipeline import Pipeline, make_pipeline

d = pd.read_csv("Youtube01-Psy.csv")
vectorizer = CountVectorizer()
dvec = vectorizer.fit_transform(d['CONTENT'])
dshuf = d.sample(frac=1)  # Shuffling the data

# Splitting the data into training and testing
d_train = dshuf[:300]
d_test = dshuf[300:]

d_train_att = vectorizer.fit_transform(d_train['CONTENT'])  # Fit
# bag-of-words on training set
d_test_att = vectorizer.fit_transform(d_test['CONTENT'])  # Reuse on testing
# set

d_train_label = d_train['CLASS']
d_test_label = d_test['CLASS']

# Building random forest
clf = RandomForestClassifier(n_estimators=80)
clf.fit(d_train_att, d_train_label)

# Cross validation
scores = cross_val_score(clf, d_train_att, d_train_label, cv=5)
# Show average score and +/- two standard deviations away
print("Accuracy: %0.2f (+/- %0.2f)" % (scores.mean(), scores.std() * 2))

# Load all datasets and combine them
d = pd.concat([pd.read_csv("Youtube01-Psy.csv"), pd.read_csv(
    "Youtube02-KatyPerry.csv"), pd.read_csv(
    "Youtube03-LMFAO.csv"), pd.read_csv("Youtube04-Eminem.csv"),
               pd.read_csv("Youtube05-Shakira.csv")])

# Shuffle entire dataset and separate comments and answers
dshuf = d.sample(frac=1)
d_content = dshuf['CONTENT']
d_label = dshuf['CLASS']

# Set up a pipeline
pipeline = Pipeline([('bag-of-words', CountVectorizer()), ('random forest',
                    RandomForestClassifier())])
make_pipeline(CountVectorizer(), RandomForestClassifier())
pipeline.fit(d_content[:1500], d_label[:1500])
