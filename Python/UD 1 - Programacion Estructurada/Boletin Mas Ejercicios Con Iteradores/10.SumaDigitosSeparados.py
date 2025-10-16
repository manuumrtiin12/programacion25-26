numero = int(input("Dame un numero: "))
suma = 0

while numero != 0:
    ultimoDigito = numero % 10
    print (ultimoDigito)
    numero = numero // 10


