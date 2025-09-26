numero1 = int(input("Dame un numero: "))
numero2 = int(input("Dame otro numero: "))
contador = 0

if numero1 >= 1:
    contador += 1
    print("El primer numero es positivo")

if numero2 >= 1:
    contador += 1
    print("El segundo numero es positivo")

print("Cantidad de numeros positivos: ", contador)