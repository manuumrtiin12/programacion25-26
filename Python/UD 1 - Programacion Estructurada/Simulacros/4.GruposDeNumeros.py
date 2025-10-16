numero = int(input("Introduce un numero: "))
numero1 = int(input("Introduce otro numero: ")) 
numero2 = int(input("Introduce el ultimo numero: "))

while numero != 0 and numero1 != 0 and numero2 != 0:
    print(f"Estos son tus numeros: {numero} {numero1} {numero2}")
   
    if numero > numero1 and numero1 > numero2:
        print("Decreciente")
        numero = int(input("Introduce un numero: "))
        numero1 = int(input("Introduce otro numero: ")) 
        numero2 = int(input("Introduce el ultimo numero: "))

    elif numero2 > numero1 and numero1 > numero:
        print("Creciente")
        numero = int(input("Introduce un numero: "))
        numero1 = int(input("Introduce otro numero: ")) 
        numero2 = int(input("Introduce el ultimo numero: "))

    else:
        print("Desordenado")
        numero = int(input("Introduce un numero: "))
        numero1 = int(input("Introduce otro numero: ")) 
        numero2 = int(input("Introduce el ultimo numero: "))