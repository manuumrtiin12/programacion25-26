numero = input("Dame un número: ")

listaNumero = []

for i in numero:
    listaNumero.append(i)

numerosEliminar = int(input("¿Cuántos números quieres eliminar por delante?: "))

for i in range(numerosEliminar):
    if len(listaNumero) > 0:
        listaNumero.pop(0)

resultado = ""
for i in listaNumero:
    resultado = resultado + i

print("Resultado:", resultado)
