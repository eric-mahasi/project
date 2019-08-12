"""A simple decision tree classifier"""
import matplotlib.pyplot as plt
import numpy as np
import pandas as pd
from sklearn import tree
from sklearn.model_selection import cross_val_score

d = pd.read_csv('student-por.csv', sep=';')
# Generate binary label (pass/fail) based on G1+G2+G3 (test grades,
# each  0-20pts); threshold for passing is sum >= 35
d['pass'] = d.apply(lambda row: 1 if (row['G1'] + row['G2'] + row['G3']) >= 35
else 0, axis=1)
d = d.drop(['G1', 'G2', 'G3'], axis=1)

# Use one-hot encoding on categorical columns
d = pd.get_dummies(d, columns=['sex', 'school', 'address', 'famsize',
                               'Pstatus', 'Mjob', 'Fjob', 'reason',
                               'guardian', 'schoolsup', 'famsup', 'paid',
                               'activities', 'nursery', 'higher',
                               'internet', 'romantic'])

# Shuffle rows
d = d.sample(frac=1)
# Split data into training and testing data sets
d_train = d[:500]
d_test = d[500:]

d_train_att = d_train.drop(['pass'], axis=1)
d_train_pass = d_train['pass']

d_test_att = d_test.drop(['pass'], axis=1)
d_test_pass = d_test['pass']

d_att = d.drop(['pass'], axis=1)
d_pass = d['pass']

# Fit a decision tree
t = tree.DecisionTreeClassifier(criterion="entropy", max_depth=5)
t = t.fit(d_train_att, d_train_pass)

# Save tree
tree.export_graphviz(t, out_file="student-performance.dot", label="all",
                     impurity=False, proportion=True, feature_names=list(
        d_train_att), class_names=["fail", "pass"], filled=True,
                     rounded=True)

# Check score of the tree
print("Score: ", t.score(d_test_att, d_test_pass))

# Cross validate the score
scores = cross_val_score(t, d_att, d_pass, cv=5)
print("Accuracy: %0.2f (+/- %0.2f)" % (scores.mean(), scores.std() * 2))

# Preparing data to be used on graph
depth_acc = np.empty((19, 3), float)
i = 0
for max_depth in range(1, 20):
    t = tree.DecisionTreeClassifier(criterion="entropy", max_depth=max_depth)
    scores = cross_val_score(t, d_att, d_pass, cv=5)
    depth_acc[i, 0] = max_depth
    depth_acc[i, 1] = scores.mean()
    depth_acc[i, 2] = scores.std() * 2
    i += 1

# Plotting the data
fig, ax = plt.subplots()
ax.errorbar(depth_acc[:, 0], depth_acc[:, 1], yerr=depth_acc[:, 2])
plt.title("Accuracy max depth")
plt.xlabel("Number of question")
plt.ylabel("Mean")
plt.show()
