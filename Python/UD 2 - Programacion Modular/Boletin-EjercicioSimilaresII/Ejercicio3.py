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

resultado = decimalToHexadecimal()
print(resultado)
