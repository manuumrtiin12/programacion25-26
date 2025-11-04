cadena = input("Introduce una cadena: ")

caracter1 = input("Introduce el carácter que quieres sustituir: ")
while len(caracter1) != 1:
    print("Debes introducir solo un carácter.")
    caracter1 = input("Introduce el carácter que quieres sustituir: ")

caracter2 = input("Introduce el carácter por el que quieres sustituirlo: ")
while len(caracter2) != 1:
    print("Debes introducir solo un carácter.")
    caracter2 = input("Introduce el carácter por el que quieres sustituirlo: ")

nueva_cadena = ""

for letra in cadena:
    if letra == caracter1:
        nueva_cadena = nueva_cadena + caracter2
    else:
        nueva_cadena = nueva_cadena + letra

if caracter1 in cadena:
    print("La nueva cadena es:", nueva_cadena)
else:
    print("El carácter que querías sustituir no aparece en la cadena.")
