import random

num1 = random.randint(1, 10)
num2 = random.randint(1,10)
suma = num1 + num2

print(f"El primer numero es {num1} y el segundo numero es {num2}")
respuesta = int(input("Cual es la suma de estos numeros: "))

while respuesta != suma:
    print("¡Has fallado!")
    respuesta = int(input("Cual es la suma de estos numeros: "))

print("¡Enhorabuena!")