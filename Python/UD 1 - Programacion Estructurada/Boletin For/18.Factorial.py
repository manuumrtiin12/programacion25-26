numero = int(input("Dame un numero para conocer su factorial:"))
factorial = 1

for i in range(2, numero + 1):
    factorial *= i
print(f"Factorial de {numero} es {factorial}")
