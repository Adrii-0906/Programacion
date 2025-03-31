def es_par(num):
    return num % 2 == 0

def numeros_pares(lista):
    pares = []
    for i in lista:
        if es_par(i):
            pares.append(i)
    return pares