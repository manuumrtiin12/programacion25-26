numero = input("Dame un numero: ")

lista = []

for i in range(len(numero) - 1, -1, -1):
    lista.append(lista[i])

print(f"El numero tiene {len(lista)} digitos")