puntaje = int(input("Cual es tu puntaje de credito?: "))
ingresosAnuales = int(input("Cuales son tus ingresos anuales?: "))

if puntaje >= 700 and ingresosAnuales >= 60000:
    print("El cliente es apto para Credito de Prestamo Hipotecario")

else:
    print("El cliente no es apto")