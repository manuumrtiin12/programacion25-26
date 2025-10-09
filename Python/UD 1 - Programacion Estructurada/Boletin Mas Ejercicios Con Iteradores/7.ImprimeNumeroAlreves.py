numero = int(input("Dame un numero: "))

while numero != 0:
    ultimoDigito = numero % 10
    print (ultimoDigito)
    numero = numero // 10
