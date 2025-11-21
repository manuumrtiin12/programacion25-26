def registrarNotas():
    secuencia = []
    print("Vamos a registrar las notas")

    notas = int(input(f"Cual es la nota: "))
    secuencia.append(notas)

    while notas > 0:

        notas = int(input(f"Cual es la nota: "))

        if notas > 0:
            secuencia.append(notas)

    valida(notas, secuencia)
    MinimoYMaximo(secuencia)
    calculaPuntos(secuencia)

    return notas

def valida(nota, secuencia):
            
        if nota in secuencia:
            print("La lista no es vaida")
            print(False)

        else:
            print("La lista es vaida")
            print(True)
    
def MinimoYMaximo(secuencia):
    print(f"El numero mayor es: {max(secuencia)}")
    print(f"El numero menor es: {min(secuencia)}")

def calculaPuntos(secuencia):
    
    puntos = len(secuencia)
    print(f"Los puntos totales son: {puntos}")

    return puntos

registrarNotas()    

#[2,1,3,4]
#[3,2,5] NO V
#[2,3,2]
