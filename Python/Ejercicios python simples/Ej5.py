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
