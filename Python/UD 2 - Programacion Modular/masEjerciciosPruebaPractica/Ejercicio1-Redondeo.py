def redondeNumero():
    numero = input("Dame un numero para redondearlo: ")

    if "." not in numero:
        numero += ".00"
    
    partes = numero.split(".")
    parteEntera = partes[0]
    parteDecimal = partes[1]

    if len(parteDecimal) == 1:
        parteDecimal += "00"

    elif len(parteDecimal) == 2:
        parteDecimal += "0"

    decimal1 = int(parteDecimal[0])
    decimal2 = int(parteDecimal[1])
    decimal3 = int(parteDecimal[2])

    if decimal3 >= 5:
        if decimal2 == 9:
            if decimal1 == 5:
                parteEntera = str(int(parteEntera) + 1)
                parteDecimal = "00"
            else:
                parteDecimal = "00"
        else:
            parteDecimal = str(decimal2 + 1) + "0"
    else:
        parteDecimal = "00" 

    return parteEntera + "." + parteDecimal

print(redondeNumero())