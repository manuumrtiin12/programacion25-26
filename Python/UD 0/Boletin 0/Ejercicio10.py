numero1 = int(input("Dame un número: "))
numero2 = int(input("Dame otro número: "))

if numero2 != 0:
    division = numero1 / numero2
    print("Resultado:", division)
else:
    print("No se puede dividir entre 0, inténtalo de nuevo")
    numero2 = int(input("Dame otro número: "))

    if numero2 != 0:
        division = numero1 / numero2
        print("Resultado:", division)
    else:
        print("Sigue siendo 0. No se puede dividir.")
