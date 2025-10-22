listaNumeros = []

for i in range(10):
    numero = int(input("Dame un numero: "))
    listaNumeros.append(i)

print(f"Orden original: {listaNumeros}")
print(f"Orden inverso: {listaNumeros[::-1]}")