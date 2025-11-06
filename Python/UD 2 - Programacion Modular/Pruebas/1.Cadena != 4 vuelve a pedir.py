cadena = input("Escribe algo: ")

while len(cadena) < 4:
    print("No valido, vuelve a intentarlo ")
    cadena = input("Escribe algo: ")

numero = int(input("Dame un numero: "))

if numero % 2 == 0:
    cadenaPar = cadena[2] + cadena[4]

    for i in range(numero):
        Resultado = cadenaPar + cadenaPar
    
    print(f"Solucion: {Resultado}")

print(" ")
print("¡Perfecto!")
