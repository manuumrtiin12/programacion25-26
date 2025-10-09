numero = int(input("Dame un numero: "))

for i in range(numero):

    if i % 2 == 0:
        print("*" + "#" * (numero-2) + "*")
    
    else:
        print("*" + " " * (numero-2) + "*")