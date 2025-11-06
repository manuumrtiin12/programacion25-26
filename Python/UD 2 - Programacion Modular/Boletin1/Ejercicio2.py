def esMultiplo():

    if numero1 % numero2 == 0:
        print(f"{numero1} es multiplo de {numero2}")
    
    elif numero2 % numero1 == 0:
        print(f"{numero2} es multiplo de {numero1}")
    
    else:
        print("Ninguno de los dos numeros es multiplo de ninguno...")


numero1 = int(input("Dame un numero: "))
numero2 = int(input("Dame otro numero: "))
esMultiplo()