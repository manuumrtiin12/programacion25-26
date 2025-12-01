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

        
binarioToDecimal()
