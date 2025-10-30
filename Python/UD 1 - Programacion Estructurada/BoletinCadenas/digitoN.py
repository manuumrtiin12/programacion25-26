numero = input("Dame un numero: ")

listaNumero = []

for i in numero:
    listaNumero.append(i)

posicion = int(input("Dame la posicion del numero que quieres conocer: "))

print(f"La posicion es: {listaNumero[posicion]}")