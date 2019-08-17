import matplotlib.pyplot as plt
import pandas as pd
import seaborn as sns
from sklearn.linear_model import LogisticRegression
from sklearn.metrics import classification_report
from sklearn.model_selection import train_test_split

ad_data = pd.read_csv("advertising.csv")
print(ad_data.columns)

X = ad_data[['Daily Time Spent on Site', 'Age', 'Area Income',
            'Daily Internet Usage', 'Male']]
y = ad_data['Clicked on Ad']
X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.3,
                                                    random_state=101)
logmodel = LogisticRegression()
logmodel.fit(X_train, y_train)

predictions = logmodel.predict(X_test)
report = classification_report(y_test, predictions)
print(report)
sns.distplot((y_test-predictions))
plt.show()
