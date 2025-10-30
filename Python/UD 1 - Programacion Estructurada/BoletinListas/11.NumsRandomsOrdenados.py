import random

pares = []
impares = []

for i in range(20):
    num = random.randint(0,100)
    
    if num % 2 == 0:
        pares.append(num)
    
    else:
        impares.append(num)

print(f"Este es el orden: {pares + impares}") 