import random


diasSemana = ['Lunes', 'Martes', 'Miercoles', 'Jueves', 'Viernes', 'Sabado', 'Domingo']

#1
print("Apartado 1")
print(diasSemana[6])

#2
print("Apartado 2")
for i in range(0,6):
    print(diasSemana[random.randint(0, 6)])

#3
print("Apartado 3")
nums = []

for i in range(0,21):
    if i % 3 == 0:
        nums.append(i)
print(nums)

#4
print("Apartado 4")


#5
print("Apartado 5")
nums.insert(8, "programo")
print(nums)