#Programa que lea de teclado una letra minuscula (suponemos que la entradda de datos es correcta), y escriba al letra mayuscula correspondiente a la letra miniscula leida previamente

#Leer una letra desde el teclado
try:
    letra_miniscula = input('Dime una palabra en miniscula: ')

    #Comprobamos que se haya introducido una unica letra
    if len(letra_miniscula) != 1:
        raise ValueError('La entrada debe de ser una unica letra')
    #Comprobamos si es un caracter alfabetico
    if not letra_miniscula.isalpha():
        raise ValueError('La entrada debe ser una entrada minuscula')
    #Comprobar si la letra de entrada es minuscula
    if not letra_miniscula.islower():
        raise ValueError('La entrada debe ser una letra minuscula')

    letra_mayuscula = letra_miniscula.upper()

    print(f'La letra mayuscula correspondiente es {letra_mayuscula}')
except ValueError as e:
    print(f'Error: {e}')