num=int(input("Ingrese la dimensión del vector: "))
nummay=0
vec=[];

for i in range (num):
    nume=int(input("Ingrese el número: "))
    vec.append(nume)
print(vec)

for i in range (num):
    if (vec[i]>nummay):
         nummay=vec[i]
print("El número mayor del vector es: " +str(nummay))
