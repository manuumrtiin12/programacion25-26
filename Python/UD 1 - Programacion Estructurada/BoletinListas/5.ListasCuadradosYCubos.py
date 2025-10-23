import random

lista1 = []
lista2 = []
lista3 = []

for i in range(0,21):
    numero1 = random.randint(0,100)
    lista1.append(numero1)

for n in lista1:
    numero = n * n
    lista2.append(numero)

for y in lista1:
    numero = n*n*n
    lista3.append(numero)

print("Numero | Cuadrado | Cubo")
for i in range(20):     
    print(f"| {lista1[i]}   |   {lista2[i]}   |   {lista3[i]} |")

