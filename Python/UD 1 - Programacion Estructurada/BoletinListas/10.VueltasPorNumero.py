numeros = []

numeroVueltas = int(input("Cuantas vueltas tiene que dar: "))

for i in range(15):
    num = int(input("Introduce el número: "))
    numeros.append(num)

if numeroVueltas > len(numeros):
    print("Numero Invalido...")
    numeroVueltas = int(input("Cuantas vueltas tiene que dar: "))


numeros_rotados = numeros[-numeroVueltas:] + numeros[:-numeroVueltas]

print(f"Lista normal: {numeros}")
print(f"Lista rotada: {numeros_rotados}")