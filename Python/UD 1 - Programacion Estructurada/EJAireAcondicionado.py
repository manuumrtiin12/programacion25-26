temperatura = int((input("Dame la temperatura que hace para encender el aire acondicionado o la calefaccion: ")))

if temperatura > 23:
    print("entro en el if")
    print("Encenciendo el aire acondicionado")

elif temperatura > 90 and temperatura < 21:
    print("entro en el elif")
    print("Enciendo la calefaccion")

else:
    print("entro en el else")
    print("Sin acciones")

print("Regisitro: ", temperatura)
   