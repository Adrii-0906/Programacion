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