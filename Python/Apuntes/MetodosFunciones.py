#FUNCIONES Y MODALIDADES

#La sintaxis básica de una función
'''
def nombre función(parametro):
    #Cuerpo de la función
    return resultado
    
def: palabra clave apra definir un función nombre_funcion: nombre descriptivo que la id parametros: variables que reccibe la función return: devuelve un valor (opcional)
'''
import this
import modulo_mates
from modulo_mates import sumar as s 
#Ejemplo básico
def saludar(nombre):
    print(f'hola {nombre}')
    
#LLamada o invocacion de la función
saludar('Adrian')

#Parametros posicionales. Deben ser proporcinados en el mismo orden en que se definen en la función.
#Parametros nombrados que permiten especificar un valor de manera explicita, sin importar el orden.
def mostrar_info(nombre, edad):
    print(f'{nombre}. Edad {edad}')
#Llamada con param pos
mostrar_info('Adrian', 18)
#Llamada en param nombrados
mostrar_info(edad=18, nombre='Adrian')

#Valorespor defecto en parametros

def saludar(nombre, mensaje='Hola'):
    print(f'{mensaje}, {nombre}')

saludar('Adrian')
saludar('Adrian', 'Buenos días')

#Funciones que devuelven valores --> return

def sumar(a, b):
    return a + b

#Argumentos y parametros FLEXIBLES

#Parametro posicional indefinido *arg
def suma(*numeros):
    total = 0
    for num in numeros:
        total += num
    return total

#Llamada a la función
print(suma(1, 2, 3, 4))
#*arg permite recibir una tupla con todos
#Parametros nombramos indefinidos **args
#Permite recibir un numero indefinido de parametros con nombre en forma de un diccionario
def mostrar_datos(**datos):
    for clave, valor in datos.items():
        print(f'{clave}: {valor}')
mostrar_datos(nombre='Ana', edad=25, ciudad='Madrid')
    
    
dicc1 = {
    'Nombre': 'Sara',
    'Edad': 27,
    'DNI': 12014324
}
print(dicc1)

#Funciones anidadas y ambito de variables

#Funciones dentro de una función. Es  util cuando una función necesita logica adicional que no se  utilizará fuera de su contexto.

def operacion(opcion):
    def suma(a, b):
        return a + b
    def resta(a, b):
        return a - b
    if opcion == 'suma':
        return suma
    elif opcion == 'resta':
        return resta

func = operacion('suma')
print(func(5, 3)) #Salida: 8
func = operacion('resta')
print(func(5, 3)) #Salida: 2

#Ambito de variables: las variables definidas dentro de una función tienen un ambito local, lo que significa que no son accesibles fuera de esa función.
def saludo():
    mensaje = 'Hola, DAM'
    print(id(mensaje))
    
saludo() #Salida: Hola, DAM
mensaje = 9
print(id(mensaje))


#Funciones lambda
#Son funciones pequeñas pequeñas y rapidas definidas en una sola linea que son utiles cuando se necesita una funcion para un uso temporal

#Uso de lanbda: lambda parametros: expresion
#Ej. Función lambda para sumar 2 numeros.
'''
suma = lambda a, b: a + b
print(suma(3,4))

numeros = [1, 2, 3, 4, 5]
dobles = list(map(lambda x: x*2, numeros))
print(dobles)
'''
'''
def saludo():
    print('Hola')
def despedida():
    print('adios')


#Asignar una función a una variable
accion = saludo
print(accion())

#Pasar funciones como argumentos
def ejecutar_funcion():
    print(func())

ejecutar_funcion(despedida())
'''

#Decoradores. Son funciones avanzadas que permiten modificar el comportamiento de una fincion sin cambiar su codigo. SOn funciones que reciben otra funcion como argumetno y devuelvan una nueva función.
def decorador(func):
    def nueva_funcion():
        print('ANTES de la funcion original')
        func()
        print('DESPUES de la funcion original')
    return nueva_funcion

decorador
def saludar():
    print('Hola')
    
saludar()


#MODULARIDAD

#Un modulo en Python es  un archivo que contiene definiciones y declaraciones de variables, funciones y clases. Los modulospermiten praganizar el codigo en partes reutilizabeles y separar fiuncionalidades dentro de un proyecto
#Para usar el contenido de un modulo en otro archivo --> import

resultado_suma = modulo_mates
sumar(5, 3)
print(resultado_suma)
resultado_resta = modulo_mates


resultado_suma = s(6, 6)