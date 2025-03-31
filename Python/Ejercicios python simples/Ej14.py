'''
Escribir un programa que pregunte al usuario una cantidad a invertir, el interés anual y el número de años, y muestre por pantalla el capital obtenido en la inversión cada año que dura la inversión.
'''

#Creamos 3 variables una para saber la cantidad que vamos a invertir, otra para saber el interes que vas a ganar al año y la ultima para saber los años de la invesión.

num_inversion = float(input('Dime la cantidad que quieres invertir: '))
interes_anuel = float(input('Dime tu interes anual: '))
años = int(input('Dime el numero de años: '))

#Ahora creamos un for donde nos vaya a imprimir los años que vamos a invertir y cuanto. Ahora dentro del for hacemos la operación para saber todo lo que ganamos cada año. Y por ultimo hacemos un print donde le vamos a hacer un round para redondear la inversion a 2 decimales, el cual va a tenr dentro el dinero generado y luego imprimimos i que son en los años que lo generamos.

for i in range(años):
    num_inversion *= 1 + interes_anuel / 100
    print('El dinero que tenemos es de', round(num_inversion, 2), '€ en', (i + 1), 'años')