import random

NumRandom = random.randint(1, 10)
EleccionHumano = int(input("Dame un numero: "))

while NumRandom != EleccionHumano:
    print("¡No has acertado!")
    EleccionHumano = int(input("Dame un numero: "))

print("¡Enhorabuena!")
