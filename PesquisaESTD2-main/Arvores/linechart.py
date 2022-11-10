import pandas as pd
from matplotlib import pyplot as plt

plt.rcParams["figure.figsize"] = [7.00, 3.50]
plt.rcParams["figure.autolayout"] = True
 
columns = ['ÁrvoreAVlOrdenada', 'ÁrvoreAVlAleatoriz', 'ÁrvoreFlamenguistaOrdenada', 'ÁrvoreFlamenguistaAleatoria', 'ArvoreB-Ordenada-1' , 'ArvoreB-Aleatoria-1' , 'ArvoreB-Ordenada-5' , 'ArvoreB-Aleatoria-5' ,'ArvoreB-Ordenada-10' , 'ArvoreB-Aleatoria-10']

df = pd.read_csv("Result.csv", usecols=columns, sep=";")
df.plot()

plt.yscale("log")
plt.show()