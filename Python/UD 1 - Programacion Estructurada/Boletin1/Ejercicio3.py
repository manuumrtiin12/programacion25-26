esVip = input("Eres vip SI/NO: ").upper
importe = float(input("Importe gastado: "))

if esVip == "SI":
    print("Enhorabuena, obtienes el descuento")

elif importe >= 100:
    print("Obtienes el descuento")

elif importe < 100:
    print("No obtienes el descuento")

else:
    print("No obtienes el descuento")

