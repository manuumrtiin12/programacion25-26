from time import process_time_ns


listaPalabras = []

letra = input("Dame una letra para filtrar: ").lower()
añadirLista = input("Dame las letras que quieres añadir y escribe stop para parar: ").lower()

while añadirLista != "stop":
    listaPalabras.append(añadirLista)
    añadirLista = input("Dame las letras que quieres añadir y escribe stop para parar: ").lower()



print(f"La letra introducida es: {letra.upper()}")
print(f"Esta seria la lista de palabras: {listaPalabras}")
print(f"La cantidad de palabras es de {len(listaPalabras)}")

print("=" * 65)
print("[E] Devolver la lista de palabras que comienzan por la letra")
print("[C] Devolver la lista de palabras que contienen  la letra")
print("[L] Ordena de menor a mayor")
print("[S] Terminar el programa")
print("=" * 65)
eleccionMenu = input("Que quieres hacer?: ").upper()

while eleccionMenu != "S":
    
    if eleccionMenu == "E":
        
        for i in range(0, len(listaPalabras)):

            palabraComienza = ""

            palabraComienza = listaPalabras[i]

            if palabraComienza[0] == letra:
                print(palabraComienza)
            
    elif eleccionMenu == "C":

        for i in range (0, len(listaPalabras)):

            palabraContiene = ""

            palabraComienza = listaPalabras[i]

            if letra in palabraComienza:
                print(palabraComienza)   

    else:
        print("Opcion no valida, intentelo de nuevo: ")
        eleccionMenu = input("Que quieres hacer?: ").upper()
    
    print("=" * 65)
    print("[E] Devolver la lista de palabras que comienzan por la letra")
    print("[C] Devolver la lista de palabras que contienen  la letra")
    print("[L] Ordena de menor a mayor")
    print("[S] Terminar el programa")
    print("=" * 65)
    eleccionMenu = input("Que quieres hacer?: ").upper()

print("Programa terminado...")

            






