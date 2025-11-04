nombre_completo = "manuel martin"
palabras = nombre_completo.split()
palabras_formateadas = []

for p in palabras:
    primera_letra = p[0].upper()
    resto = p[1:].lower()
    palabra_formateada = primera_letra + resto
    palabras_formateadas.append(palabra_formateada)

nombre_formateado = " ".join(palabras_formateadas)

print(nombre_formateado)
