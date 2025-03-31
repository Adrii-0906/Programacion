def Ejercicio1():
    '''
    Escribir un programa que pregunte el nombre del usuario en la consola y después deque el usuario lo introduzca muestre por pantalla la cadena ¡Hola <nombre>!, donde <nombre> es el nombre que el usuario haya introducido.
    '''
    #Preguntamos el nombre del ususario por consola para introducir su nombre
    nombre = input('Dime tu nombre: ')
    #Imprimimos por pantalla el nombre del ususario
    print(f'¡Hola {nombre}!')
    
def Ejercicio2():
    '''
    Escribir un programa que pregunte el nombre del usuario en la consola y un número entero e imprima por pantalla en líneas distintas el nombre del usuario tantas veces como el número introducido.
    '''
    #Preguntamos el nombre del ususario por consola para introducir su nombre
    nombre = input('Dime tu nombre: ')
    #Le decimos que nos introduzca un numero entero por pantalla
    num = int(input('Dime un numero entero: '))
    #Ahora imprimimos el nombre que hemos introducido tantas veces como el numero que hemos puesto por pantalla
    print((nombre + '\n') * int(num))
    
def Ejercicio3():
    '''
    Escribir un programa que pregunte el nombre del usuario en la consola y después de que el usuario lo introduzca muestre por pantalla el nombre en mayúsculas y el número de caracteres que contiene en líneas distintas.
    '''
    #Creamos la variable "nombre" a la cual le vamso a guardar un nombre ecrito por pantalla:
    nombre = input("Dime tu nombre: ")
    #Ahora hacemos un print para imprimir la variable "nombre" escrita en mayusculas, para hacer eso utilizamos upper, y hacemos "nombre.upper" dentro del print, pero sin comillas.
    print(nombre.upper())
    #Una vez puesto el nombre el mayusculas vamos a hacer el recuento de palabras que contiene la palabra para ellos utilizamos la función len.
    print(len(nombre))
    
def Ejercicio4():
    '''
    Escribir un programa que realice la siguiente operación aritmética. ((2 + 3) / (2 *5 )) ** 2
    '''

    #Hacemos un print para ver la operacion que vamos a ejecutar.
    print('Vamos a ejecutar la siguiente opreción ((2 + 3) / (2 *5 )) ** 2:')
    #Ahora hacemos una varible llamada "operacion" donde vamos a introducir la operación que vamos a realizar y vamos a guardar el resultado en la varibale creada:
    operacion = ((2 + 3) / (2 *5 )) ** 2
    #Por ultimo imprimimos con print el resultado de la operación.
    print('El resultado es: ', operacion)
    
def Ejercicio5():
    '''
    Una juguetería tiene mucho éxito en dos de sus productos: payasos y muñecas. Suele hacer venta por correo y la empresa de logística les cobra por peso de cada paquete así que deben calcular el peso de los payasos y muñecas que saldrán en cada paquete a demanda. Cada payaso pesa 112 g y cada muñeca 75 g. Escribir un programa que lea el número de payasos y muñecas vendidos en el último pedido y calcule el peso total del paquete que será enviado.
    '''
    #Creamos la variable payasos y muñecas donde vamos a decir que nos introduzca un numero, ese numero es el numero de payasos y muñecas vendadidos.
    payasos = int(input('Dime el numero de payasos vendidos en el ultimo pedido: '))
    muñecas = int(input('Dime el numero de muñecas vendidos en el ultimo pedido: '))
    #Ahora a las variables creadas le decimos el numero de payasos y muñecas vendidas se multipliquen por su peso.
    payasos = payasos * 112
    muñecas = muñecas * 75
    #Por ultimo imprimimos el peso sumado de los dos del ultimo pedido.
    print('El pedido pesa', payasos + muñecas, 'gramos')
    
def Ejercicio6():
    '''
    Escribir un programa que pregunte al usuario su edad y muestre por pantalla si es mayor de edad o no.
    '''
    #Creamos una variable llamada "edad", donde vamos a ingresar una edad.
    edad = int(input('Dime tu edad: '))
    #Ahora le añadimos una condición, si la edad es mayor o igual a 18 años nos imprima que eres mayor de edad, sino que imprima que eres menor.
    if edad >= 18:
        print('Eres mayor de edad')
    else:
        print('Eres menor de edad')
        
def Ejercicio7():
    '''
    Escribir un programa que pida al usuario dos números y muestre por pantalla su división. Si el divisor es cero el programa debe mostrar un error.
    '''
    #Ahora vamos crear 2 variables donde una va hacer el divisor y la otra dividendo. Esta variable es de tipo float porque podemos introducir numeros decimales.
    num1 = float(input('Dime un numero: '))
    num2 = float(input('Dime otro numero: '))
    #Ahora hacemos la condición de que si num2 es igual a 0 imprimimamos que ha habido un error. Sino imprimimos el resultado de la operación.
    if num2 == 0:
        print('¡Ha habido un error!')
    else:
        print(num1 / num2, 'Este es el resultado')
        
def Ejercicio8():
    '''
    Escribir un programa que pida al usuario dos números y devuelva su división. Si el usuario no introduce números debe devolver un aviso de error y si el divisor es cero también.
    '''
    try:
        #Pedimos los dos numeros que vamos a dividir al usuario.
        n1= input('Dime un numero: ')
        n2= input('Dime otro numero:')
        #Ahora para saber si son numeros o no los convertimos en float. Si son letras nos dara error al convertirlos en float.
        n1 = float(n1)
        n2 = float(n2)
        #Le decimos que si la variable n2 es igual a 0 nos muestre un error.
        if n2 == 0:
            raise ValueError('Error. No se puede completar la división')
        #Si el if no se cumple nos mostrará el resultado de la operacion.
        resultado = n1 / n2
        print(f'El resulatado de la operación es {resultado}')
        
    except ValueError as ve:
        print(ve)
    except Exception:
        print("Por favor dime un numero que sea valido")
        
def Ejercicio9():
    '''
    Escribir un programa para una empresa que tiene salas de juegos para todas las edades y quiere calcular de forma automática el precio que debe cobrar a sus clientes por entrar. El programa debe preguntar al usuario la edad del cliente y mostrar el precio de la entrada. Si el cliente es menor de 4 años puede entrar gratis, si tiene entre 4 y 18 años debe pagar 5€ y si es mayor de 18 años, 10€.
    '''
    #Primero hacemos una variable donde vamos a intrducir la edad de la personas que quierene entrar.
    edad = int(input('Dime tu edad: '))
    #Ahora hacemos un condicional que si tiene menos de 4 años puede pasar gratis, si tiene menos de 18 y mas o igual a 4 años tiene que pagar 5€, sino tiene que pagar 10€. Para ello hemos utilizado if, elif y else.
    if edad < 4:
        print('Entras gratis')
    elif edad < 18 and edad >= 4:
        print('Tienes que pagar 5€')
    else:
        print('Debes pagar 10€')
        
def Ejercicio10():
    '''
    Escribir un programa que pida al usuario una palabra y la muestre 10 veces por pantalla.
    '''
    #Creamos una variable donde vamos introducir una palabra.
    a = input('Dime una palabra: ')
    #Ahora utlizando un for, vamos a hacer que nos imprima 10 veces la palabra escrita dentro de la variable.
    for i in range(10):
        print(a)
        
def Ejercicio11():
    '''
    Escribir un programa que pregunte al usuario su edad y muestre por pantalla todos los años que ha cumplido (desde 1 hasta su edad).
    '''
    #Creamos la variabel edad, donde vamos a introducir un numero entero.
    edad = int(input('Dime tu edad: '))
    #Ahora con un for vamos hacer que nos muestre el rango desde 1 hasta su edad, y lo vamos a imprimir.
    for i in range(1, edad+1):
        print(i)

def Ejercicio12():
    '''
    Escribir un programa que pida al usuario un número entero positivo y muestre por pantalla todos los números impares desde 1 hasta ese número separados por comas.
    '''
    #Creamos la variable num de tipo entero e introducimos un numero entero positivo.
    num = int(input('Dime un numero entero positivo: '))
    #Ahora utilizando for vamos hacer que muestre todos los numero impares en un rango de 1 hasta el numero que hemos introducido en la variable. Utilizamos end="," para separar lo numeros por comas.
    for i in range(1, num + 1, 2):
            print(i, end=",")
            
def Ejercicio13():
    '''
    Escribir un programa que pida al usuario un número entero positivo y muestre por pantalla la cuenta atrás desde ese número hasta cero separados por comas.
    '''
    #Creamos la variable num y le pedimos a la persona que escriba un numero entero positivo.
    num = int(input('Dime un numero entero positivo: '))
    #Ahora hacemos un for para que separado por comas nos muestre una cuenta atras desde el numero que hemos metido la variable hasta 0.
    for i in range(num,-1,-1):
        print(i, end=",")
        
def Ejercicio14():
    '''
    Escribir un programa que pregunte al usuario una cantidad a invertir, el interés anual y el número de años, y muestre por pantalla el capital obtenido en la inversión cada año que dura la inversión.
    '''
    #Pedimos que por pantalla nos digan la cantidad a invertir, el interes de cada año, y los años que vamos a invertir.
    cantidad = float(input('Cantidad a invertir: '))
    interes = float(input('Interes anual: '))
    anos = int(input('Años de la inversión: '))
    #Ahora con el for le decimos que i nos muestre los años en un rango de 1 al año que hemos introducido +1, porque siempre nos resta un numero del introducido por eso sumamos 1.
    for i in range(1, anos+1):
        #Ahora calculamos el capital que vamos a ganar con el interes que hemos puesto.
        cantidad += cantidad * interes
        #Por ultimo imprimimos los años que hemos puesto con la variable 'i' y la cantidad que hemos ganado con 2 decimales, por eso ponemos '.2f'.
        print(f'Capital tras el año {i}: {cantidad:.2f}€')
        
def menu():
    print('------------MENU------------')
    print('-----EJERCICIOS BASICOS-----')
    print('--------Ejercicio 1---------')
    print('--------Ejercicio 2---------')
    print('--------Ejercicio 3---------')
    print('--------Ejercicio 4---------')
    print('--------Ejercicio 5---------')
    print('--------Ejercicio 6---------')
    print('--------Ejercicio 7---------')
    print('--------Ejercicio 8---------')
    print('--------Ejercicio 9---------')
    print('--------Ejercicio 10--------')
    print('--------Ejercicio 11--------')
    print('--------Ejercicio 12--------')
    print('--------Ejercicio 13--------')
    print('--------Ejercicio 14--------')
    print('------------exit------------')
    print('----------------------------')
    
    while True:
        ejercicio = input('Dime el numero del ejercicio: ')
        if ejercicio == '1':
            Ejercicio1()
        elif ejercicio == '2':
            Ejercicio2()
        elif ejercicio == '3':
            Ejercicio3()
        elif ejercicio == '4':
            Ejercicio4()
        elif ejercicio == '5':
            Ejercicio5()
        elif ejercicio == '6':
            Ejercicio6()
        elif ejercicio == '7':
            Ejercicio7()
        elif ejercicio == '8':
            Ejercicio8()
        elif ejercicio == '9':
            Ejercicio9()
        elif ejercicio == '10':
            Ejercicio10()
        elif ejercicio == '11':
            Ejercicio11()
        elif ejercicio == '12':
            Ejercicio12()
        elif ejercicio == '13':
            Ejercicio13()
        elif ejercicio == '14':
            Ejercicio14()
        elif ejercicio == 'exit':
            print('Saliendo del menu')
            break
menu()