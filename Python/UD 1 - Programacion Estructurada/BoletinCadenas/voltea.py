num = input("Dame un numero para darle la vuelta: ")

listaNormal = []
listaInversa = []

for i in num:
    listaNormal.append(i)

for n in range(len(listaNormal) - 1, -1, -1):
    listaInversa.append(listaNormal[n])

print(f"Numero dado la vuelta: {listaInversa}")