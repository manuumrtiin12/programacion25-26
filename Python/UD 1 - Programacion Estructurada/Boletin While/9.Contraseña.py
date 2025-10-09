contrasenya = "1234"
contrasenyaEscrita = input("Escribe la contraseña: ")

while contrasenyaEscrita != contrasenya:
    print("Fallaste, intentalo de nuevo: ")
    contrasenyaEscrita = input("Escribe la contraseña: ")

print("Accediendo al sistema...")