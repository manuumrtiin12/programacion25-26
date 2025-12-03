def decimalToBinario():
    numero = int(input("Dame un numero entero: "))
    binario = []

    while numero > 0:
        binario.append(numero % 2)
        numero //= 2
        
    print(f"El numero es: {binario}")
    
    return binario

def binarioToDecimal():
    valido = False

    while valido == False:
        numero = input("Dame un numero binario: ")
        valido = True

        for i in range(len(numero)):
            if numero[i] != "0" and numero[i] != "1":
                print("El numero no es binario")
                valido = False

    resultado = 0
    posicion = 0

    for i in range(len(numero) -1, -1, -1):
        digito = int(numero[i])
        resultado += digito * 2**posicion
        posicion += 1

    return resultado

def decimalToHexadecimal():
    numero = int(input("Dame un numero entero: "))
    hexadecimal = []

    while numero > 0:
        resto = numero % 16
        numero //= 16

        if resto < 10:
            hexadecimal.append(resto)
        
        else:
            if resto == 10:
                hexadecimal.append("A")
            
            elif resto == 11:
                hexadecimal.append("B")
            
            elif resto == 12:
                hexadecimal.append("C")

            elif resto == 13:
                hexadecimal.append("D")

            elif resto == 14:
                hexadecimal.append("E")

            elif resto == 15:
                hexadecimal.append("F")
        
    hexadecimalBien = []

    for i in range(len(hexadecimal)-1, -1, -1):
        hexadecimalBien.append(hexadecimal[i])

    cadenaHexadecimal = ""

    for elemento in hexadecimalBien:
        cadenaHexadecimal = cadenaHexadecimal + str(elemento)

    return cadenaHexadecimal


def hexadecimalToDecimal():
    valido = False

    while valido == False:
        n = input("Dime un número hexadecimal: ").upper()
        valido = True

        for c in n:
            if not (c >= "0" and c <= "9") and not (c >= "A" and c <= "F"):
                print("ERROR: No es un hexadecimal válido")
                valido = False
                break

    resultado = 0
    posicion = 0

    for i in range(len(n) - 1, -1, -1):
        c = n[i]

        if c >= "0" and c <= "9":
            valor = int(c)
        else:
            if c == "A":
                valor = 10
            elif c == "B":
                valor = 11
            elif c == "C":
                valor = 12
            elif c == "D":
                valor = 13
            elif c == "E":
                valor = 14
            elif c == "F":
                valor = 15

        resultado += valor * (16 ** posicion)
        posicion += 1

    return resultado


def menu():
    salir = False

    while salir == False:
        print("----- MENU -----")
        print("1. Decimal a Binario")
        print("2. Binario a Decimal")
        print("3. Decimal a Hexadecimal")
        print("4. Hexadecimal a Decimal")
        print("5. Salir")

        opcion = input("Elige una opción: ")

        if opcion == "1":
            resultado = decimalToBinario()
            print(resultado)

        elif opcion == "2":
            resultado = binarioToDecimal()
            print(resultado)

        elif opcion == "3":
            resultado = decimalToHexadecimal()
            print(resultado)

        elif opcion == "4":
            resultado = hexadecimalToDecimal()
            print(resultado)

        elif opcion == "5":
            salir = True

        else:
            print("Opción no válida")

menu()
