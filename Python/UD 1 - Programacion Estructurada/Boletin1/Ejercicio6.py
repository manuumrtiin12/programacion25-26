dineroRetirar = int(input("Cuanto dinero desea retirar?: "))
saldo = float(input("Cuanto saldo tiene su cuenta?: "))

if dineroRetirar <= saldo:
    print("sacando dinero...")
    dineroRestante = saldo - dineroRetirar
    print("Tu saldo ahora es de ", dineroRestante)

else:
    print("Dinero insuficiente")

    

