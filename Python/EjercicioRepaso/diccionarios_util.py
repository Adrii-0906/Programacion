def crear_diccionario(clave, valor):
    diccionario = {}
    for i in range(len(clave)):
        diccionario[clave[i]] = valor[i]
    return diccionario

def diccionarios_invertidos(texto):
    texto = {v: k for k, v in texto.items()}
    return texto