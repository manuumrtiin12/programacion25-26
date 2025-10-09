suma = 0
numero = int(input("Dame un numero, cuando ingreses el numero 0 aparecera la suma de los numeros anteriores: "))

while numero != 0:
    suma += numero
    numero = int(input("Dame un numero, cuando ingreses el numero 0 aparecera la suma de los numeros anteriores: "))

print(suma) 