import numpy as np
import sklearn
from sklearn import metrics
from sklearn.preprocessing import scale
from sklearn.datasets import load_digits
from sklearn.cluster import KMeans

digits = load_digits()
data = scale(digits.data)
y = data.targets

k = 10
samples, features = data.shape

clf = KMeans(n_clusters=k, init="random", n_init=10)
