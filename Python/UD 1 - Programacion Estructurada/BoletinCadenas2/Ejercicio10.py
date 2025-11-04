numero = input("Introduce un número entero: ")

valido = True
for i in numero:
    if i < '0' or i > '9':
        valido = False

if valido:
    resultado = ""
    contador = 0
    for n in range(len(numero) - 1, -1, -1):
        resultado = numero[n] + resultado
        contador += 1
        if contador % 3 == 0 and n != 0:
            resultado = "." + resultado
    print(resultado)
else:
    print("Error: la cadena debe contener solo dígitos.")
