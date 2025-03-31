#n1, n2, n3 = map(int, input('Dame 3 numeros:').split())
#print(f"Los numeros son {n1, n2, n3}")

#media = float(n1+n2+n3) / 3
#print(f'La media es {round(media,2)}')

#Programa que lea una cantidad en segundos y muestre su equivalente en semanas, dias, horas, minutos y segundos, segun el formato de lso siguentes ejemplos.

'''
segundos = int(input('Dime un tiempo en segundos: '))
minutos = segundos // 60
resto_minutos = segundos % 60
print(f"{segundos} segundos son {minutos} minutos y {resto_minutos} segundos")
horas = minutos // 60
resto_horas = minutos % 60
print(f"{segundos} segundos son {horas} horas, {resto_horas} minutos")
dias = horas // 24
resto_dias = horas % 24
print(f"{segundos} segundos son {dias} días y {resto_dias} horas")
semana = dias // 7
resto_semana = dias % 7
print(f"{segundos} segundos son {semana} semana y {resto_semana} días")
'''

#Declaro constantes

SEG_MIN = 60
MIN_HR = 60
HR_DIA = 24
DIA_SEMANA = 7

#Hago conversiones, pero sigo siendo constantes

SEG_HORAS = SEG_MIN * MIN_HR
SEG_DIA = SEG_HORAS * HR_DIA
SEG_SEMANA = SEG_DIA * DIA_SEMANA

seg_totales =int(input('Introduce los segundos totales: '))

semanas = seg_totales // SEG_SEMANA
resto = seg_totales % SEG_SEMANA

dias = resto // SEG_DIA
resto = resto % SEG_DIA

horas = resto // SEG_HORAS
resto = resto % SEG_HORAS

minutos = resto // SEG_MIN
segundos = resto % SEG_MIN

print(f'{seg_totales} equivale a [{semanas:2}] semanas, {dias} dias, {horas:02}:{minutos:02}:{segundos:02}')