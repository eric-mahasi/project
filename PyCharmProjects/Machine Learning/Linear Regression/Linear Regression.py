import matplotlib.pyplot as plt
import pandas as pd
from sklearn.linear_model import LinearRegression
from sklearn.model_selection import train_test_split

df = pd.read_csv("USA_Housing.csv")

X = df[['Avg. Area Income', 'Avg. Area House Age', 'Avg. Area Number of Rooms',
       'Avg. Area Number of Bedrooms', 'Area Population']]
y = df['Price']

X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.4,

                                                    random_state=101)
lm = LinearRegression()
lm.fit(X_train, y_train)
cdf = pd.DataFrame(lm.coef_, X.columns, columns=['Coefficients'])

predictions = lm.predict(X_test)
plt.scatter(y_test, predictions)
plt.show()
