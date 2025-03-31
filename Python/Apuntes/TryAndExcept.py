#Programa de validadcion de numeros con decimales
numero = input('Dime un numero decimal: ')
while True:
    numero = input('Dime un numero decimal: ')
    try:
        if float(numero) == float(numero):
            print(f'{numero} es un numero decimal')
        elif int(numero) == int(numero):
            print(f'{numero} no es un numero decimal')
    except ValueError:
        print('El dato introcido no es valido')
        break