import matplotlib.pyplot as plt
import pandas as pd
from sklearn.datasets import load_breast_cancer
from sklearn.model_selection import train_test_split
from sklearn.svm import SVC

cancer = load_breast_cancer()
df_feat = pd.DataFrame(cancer['data'], columns=cancer['feature_names'])
X = df_feat
y = cancer['target']
X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.3,
                                                    random_state=101)

model = SVC()
model.fit(X_train, y_train)
predictions = model.predict(X_test)
plt.plot(y_test, predictions)
plt.show()
