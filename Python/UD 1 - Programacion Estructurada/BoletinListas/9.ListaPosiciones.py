numeros = []
for i in range(15):
    num = int(input("Introduce el número: "))
    numeros.append(num)

numeros_rotados = [numeros[-1]] + numeros[:-1]

print(f"Lista normal: {numeros}")
print(f"Lista rotada: {numeros_rotados}")
