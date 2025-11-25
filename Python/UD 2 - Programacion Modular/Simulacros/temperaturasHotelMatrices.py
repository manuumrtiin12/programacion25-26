from webbrowser import get


matriz = [
[22, 20, 19, 21], 
[18, 25, 23, 22], 
[19, 21, 20, 24], 
[17, 23, 22, 19], 
[24, 23, 27, 26]
 ] 


def calculaMedia(listaNumeros):
    media = 0
    
    for i in range(len(listaNumeros)):
        media =  listaNumeros[i] + media

    media = media / len(listaNumeros)
        
    return media

def calculaMediaFila(matriz):
    listaMedia = []
    for fila in matriz:
        mediaFila = calculaMedia(fila)
        listaMedia.append(mediaFila)
 
    return listaMedia

def getColumna(numColumna, matriz):

    columna0 = []

    for i in range(len(matriz)):
        columna0.append(matriz[i][numColumna])

    return columna0

def calculaMediaDeterminadaDeterminada(numColumna, matriz):
    columna = getColumna(numColumna, matriz)
    media = calculaMedia(columna)

    return media

listaNumeros = [0]
resultado = calculaMedia(listaNumeros)
print(resultado)

listaMedia = calculaMediaFila(matriz)
print(listaMedia)

columna = getColumna(matriz)
print(columna)

mediaColumna0 = calculaMedia(columna)
print(mediaColumna0)

calculaMediaDeterminadaDeterminada0 = calculaMediaDeterminadaDeterminada(matriz)
print(calculaMediaDeterminadaDeterminada0)