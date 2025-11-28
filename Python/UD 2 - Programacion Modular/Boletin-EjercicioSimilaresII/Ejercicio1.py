def generaNumeros():
    num1 = int(input("Dame un numero: "))
    num2 = int(input("Dame otro numero: "))

    num1 = str(num1)

    
    return num1, num2

def valida(num1, num2):
    if num2 > len(num1):
        print("El numero no es valido, intentalo de nuevo: ")
        num2 = int(input("Dame otro numero: "))

    return num2

def sumaDigitos(num1, num2):
    suma = 0

    for i in range(0, num2):
        suma += int(num1[i])

    return suma
  
def main():
    num1, num2 = generaNumeros()
    num2 = valida(num1, num2)
    suma = sumaDigitos(num1, num2)

    print("La suma de los digitos es: ", suma)

main()

