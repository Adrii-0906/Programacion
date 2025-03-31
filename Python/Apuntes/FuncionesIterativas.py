#FUNCIONES ITERATIVAS
#Las que repiten una operacion hasta que se cumpla una condicion.
#Son utiles cuando se necesita procesar una coleccion de datos o se desea realizar una tarea respectiva un numero especifico de veces.
#FACTORIAL de un NUMERO N. Es el producto de todos los numeros enteros positivos menores o iguales a ese numero.
def factorial_iterativo(n):
    res = 1
    for i in range(1, n+1):
        res *= i
    return res
num = int(input('Dame un numero: '))
print(factorial_iterativo(num))