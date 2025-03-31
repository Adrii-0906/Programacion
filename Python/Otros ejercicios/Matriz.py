def generador_matriz(filas, columnas):
    contador = 1

    for i in range(filas):
        for j in range(columnas):
            print(f'{contador:02}', end=' ')
            contador += 1
    print()
generador_matriz(5,5)