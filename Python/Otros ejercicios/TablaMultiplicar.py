'''
    Crea un programa que imprima todas las tablas de multiplicar del 1 al 9 ambas incluidas.
    Pista de eficiencia: utiliza dos for
'''
#resultado = 0

for i in range(1, 10):
    for j in range (1, 10+1):
        print(f'Tabla de multiplicar del {i}: {i} * {j} = {i * j}')


