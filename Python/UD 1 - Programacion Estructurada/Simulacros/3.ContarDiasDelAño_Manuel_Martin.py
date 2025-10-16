dia = int(input("Dime el dia: "))
mes = int(input("Dime el mes (con numero): "))
año = int(input("Dime el año: "))

if dia > 31 or mes > 12:
    print("Algun valor es incorrecto...")
    dia = int(input("Dime el dia: "))
    mes = int(input("Dime el mes (con numero): "))
    año = int(input("Dime el año: "))

cuenta_dias = 0

for i in range(1, mes):
    if i == 2:
        cuenta_dias += 28  

    elif i == 4 or i == 6 or i == 9 or i == 11:
        cuenta_dias += 30
    
    else:
        cuenta_dias += 31

cuenta_dias += dia
    
print(f"Hasta el {dia} del {mes} de {año} han pasado {cuenta_dias} dias")

