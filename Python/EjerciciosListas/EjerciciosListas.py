#Ejercicios: Listas
from utilidades import ordenar_lista
import filtrado
import listas_util

'''
Ejercicio 1:
1. Escribe una función llamada ordenar_lista que reciba una lista de números que devuelva la lista ordenada en orden ascendente.
2. Modulariza el programa importando la función desde un archivo llamado utilidades.py.
'''

resultado_lista = ordenar_lista()
print(resultado_lista)

'''
Ejercicio 2:
1. Escribe una función que reciba una lista de números y retorne una nueva lista con solo los números pares.
2. Utiliza la función dentro del archivo principal, pero crea el módulo filtrado.py para la definición de la función.
'''
numeros = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
resultado_pares = filtrado.numeros_pares(numeros)
print(resultado_pares)

'''
Ejercicio 3:
1. Crea una función llamada eliminar_duplicados que reciba una lista de números con elementos duplicados y retorne una nueva lista sin duplicados.
2, Obliga a que la función esté definida en un módulo externo llamado listas_util.py.
'''
numeros = [1,2,3,2,4,5,6,5,7,8,9,0,8,7,5,4,3,10,11,12,12,13,14]
resultado_sin_duplicar = listas_util.duplicados(numeros)
print(resultado_sin_duplicar)

'''
Ejercicio 4:
1. 
2. 
'''