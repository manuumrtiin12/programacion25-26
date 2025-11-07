tipoRango = input("Que tipo de rango tienes quieres? ([a]bierto/[c]errado): ").lower()

numero1 = int(input("Dime un numero: "))
numero2 = int(input("Dime otro numero: "))


contador = 0

while numero1 and numero2 != 0:

    listaImpares = []
    if numero1 >= numero2:
        numero1 = int(input("Dime un numero: "))
        numero2 = int(input("Dime otro numero: "))
        tipoRango = input("Que tipo de rango tienes quieres? ([a]bierto/[c]errado): ").lower()

    else:

        if tipoRango == "a":
            inicio = numero1+1
            fin = numero2
        
        elif tipoRango == "c":
            inicio = numero1
            fin = numero2 + 1
        
        else:
            print("opcion no valida, vuelve a intentarlo")
            tipoRango = input("Que tipo de rango tienes quieres? ([a]bierto/[c]errado): ").lower()

        for i in range(inicio, fin):
            if i % 2 != 0:
                listaImpares.append(i)
                contador += 1
    print("="*30)
    print(f"Impares que existen entre[{numero1}-{numero2}]: {listaImpares}")
    print(f"El total de numeros es: {contador}")
    print("="*30)

    tipoRango = input("Que tipo de rango tienes quieres? ([a]bierto/[c]errado): ").lower()
    numero1 = int(input("Dime un numero: "))
    numero2 = int(input("Dime otro numero: "))

print("Hasta la proxima...")