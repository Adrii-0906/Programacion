def contar_palabra(texto):
    texto = texto.lower()
    palabras = texto.split()

    conta_palabras = {}
    for palabra in palabras:
        if palabra in conta_palabras:
            conta_palabras[palabra] += 1
        else:
            conta_palabras[palabra] = 1
    return conta_palabras


