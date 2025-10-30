num = input("Dame un número para saber si es capicúa: ")

lista1 = []
lista2 = []

for i in num:
    lista1.append(i)

for n in range(len(lista1) - 1, -1, -1):
    lista2.append(lista1[n])


if lista1 == lista2:
    print("El número es capicúa.")

else:
    print("El número no es capicúa.")

    