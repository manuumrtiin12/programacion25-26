numero = int(input("Dame un numero para conocer su tabla de multiplicar: "))

for i in range(1, 11):
    resultado = numero * 1

    print(f"{i} * {numero} = {resultado}")