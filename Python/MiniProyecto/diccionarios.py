def ocurrencia(lista):
    contador = {}
    for numero in lista:
        if numero in contador:
            contador[numero] += 1
        else:
            contador[numero] = 1
    return contador