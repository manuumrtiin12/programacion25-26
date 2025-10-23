lista = []

for i in range(0, 10):
    numero = int(input("Dame un numero: "))
    lista.append(numero)

mayor = lista[0]
menor = lista[0]

for n in lista:
    if n > mayor:
         mayor = n
    elif n < menor:
        menor = n

print(lista)
print(f"El numero mayor es: {mayor}")
print(f"El numero menor es: {menor}")