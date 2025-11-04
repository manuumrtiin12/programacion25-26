nombre_completo = "manuel martin"
palabras = nombre_completo.split()
palabras_formateadas = []

for palabra in palabras:
    palabra = palabra.lower()
    
    if len(palabra) > 1:
        palabra_formateada = palabra[0].upper() + palabra[1:-1] + palabra[-1].upper()
    else:
        palabra_formateada = palabra.upper()
    
    palabras_formateadas.append(palabra_formateada)

nombre_formateado = " ".join(palabras_formateadas)
print(nombre_formateado)
