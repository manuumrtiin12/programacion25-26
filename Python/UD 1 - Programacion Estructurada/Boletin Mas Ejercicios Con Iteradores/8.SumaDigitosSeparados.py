numero = int(input("Dame un numero: "))
suma = 0

while numero != 0:
    ultimoDigito = numero % 10
    print (ultimoDigito)
    suma += ultimoDigito
    numero = numero // 10

print(f"La suma es: {suma}" )
