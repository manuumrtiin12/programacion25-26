diaSemana = ["Lunes", "Martes", "Miercoles"]
diaFinSemana = ["Sabado", "Domingo"]

print(diaSemana[1])
print(diaSemana[-1])

diaSemana.append("Viernes") #Agrego en la siguiente posicion
print(diaSemana)
diaSemana.insert(3, "Jueves") #Agrego en posicion especifica
print(diaSemana)

diaSemana = diaSemana + diaFinSemana #Unir dos listas
print(diaSemana)

diaSemana.pop(6) #Borrado por posicion
diaSemana.append("Domingo")
diaSemana.append("Terminado")
print(diaSemana)
diaSemana.remove("Terminado") #Borrar buscando
print(diaSemana)

print(diaSemana.index("Lunes")) #Devuelve la posicion del elemento, si no esta da error

