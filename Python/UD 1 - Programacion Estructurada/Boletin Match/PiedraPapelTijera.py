import random

mensajeGana = "¡Enhorabuena, has ganado!"
mensajePierde = "¡Lo siento, has perdido!"
mensajeEmpate = "¡Tu y la maquina habeis empatado!"

print("===================")
print("    1. Piedra      ")
print("    2. Papel       ")
print("    3. Tijeras     ")
print("===================")


eleccionHumano = int(input("Elige una opcion: "))
eleccionMaquina = random.randint(1,3)

print(f"Tu has sacado {eleccionHumano} y la maquina a sacado {eleccionMaquina}")

match eleccionHumano:

    case 1:
        if eleccionMaquina == 1:
            print(mensajeEmpate)
        
        elif eleccionMaquina == 2:
            print(mensajePierde)
        
        elif eleccionMaquina == 3:
            print(mensajeGana)
    
    case 2:
        if eleccionMaquina == 1:
            print(mensajeGana)
        
        elif eleccionMaquina == 2:
            print(mensajeEmpate)
        
        elif eleccionMaquina == 3:
            print(mensajePierde)
    
    case 3:
        if eleccionMaquina == 1:
            print(mensajePierde)
        
        elif eleccionMaquina == 2:
            print(mensajeGana)
        
        elif eleccionMaquina == 3:
            print(mensajeEmpate)
    
    case _:
        print("Solo puedes usar los valores seleccionados")
