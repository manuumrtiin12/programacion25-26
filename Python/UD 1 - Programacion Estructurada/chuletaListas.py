# Las cadenas son inmutables
# ================================================================

nombre = "Lucía"
nombre.replace("a", "o")  # no cambia la variable nombre
print(nombre)

nombre = nombre.replace("a", "o")  # sí cambia nombre
print(nombre)

# Paso de String a lista: list(nombreCadena) y de lista a String: for y concateno carácter a carácter
# ================================================================

nombreLista = list(nombre)  # Paso de String a lista de caracteres
nombreLista.insert(0, "A")
print(nombreLista)

cadenaSalida = ""
for valor in nombreLista:  # Paso de lista de caracteres a String
    cadenaSalida = cadenaSalida + valor

print(cadenaSalida)
