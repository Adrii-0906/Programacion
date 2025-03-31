def es_par(num):
    if num % 2 == 0:
        return num
def filtrado(lista):
    pares = []
    for i in lista:
        if es_par(i):
            pares.append(i)
    return pares