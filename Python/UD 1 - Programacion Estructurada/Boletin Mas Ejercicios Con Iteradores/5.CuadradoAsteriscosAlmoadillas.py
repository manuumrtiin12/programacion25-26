numero = int(input("Dame un numero: "))

for i in range(numero):

    if i == 0 or i == numero-1:
        print("*" + "#" * (numero-2) + "*")
    
    else:
        print("*" + " " * (numero-2) + "*")

