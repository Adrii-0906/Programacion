import random

def aleatorio(n = 10):
    return [random.randint(0,100) for i in range(n)]

def encotrar_maximo(lista):
    return max(lista)

def encotrar_minimo(lista):
    return min(lista)