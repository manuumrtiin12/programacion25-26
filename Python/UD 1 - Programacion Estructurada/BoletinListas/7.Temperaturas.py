temperaturas = []
mesesAño = ["enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"]
    
for mes in mesesAño:
    temperaturaMes = int(input(f"Que temperatura hace en {mes}: "))
    temperaturas.append(temperaturaMes)

print("=" * 40)

for i in range(12):
    print(f"{mesesAño[i]}: {temperaturas[i] * "*"} ({temperaturas[i]}ºC)")


