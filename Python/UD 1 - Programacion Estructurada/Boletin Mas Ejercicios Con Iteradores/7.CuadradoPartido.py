numero = int(input("Dame un numero: "))

for i in range(numero):

    if i % 2 == 0:
        print("*" + "#" * (numero-2) + "*")
    
    else:
        cad = ""
        for j in range (numero):

            if j % 2 == 0:
                cad += "*"

            else:
                cad += "@"

        print(cad)