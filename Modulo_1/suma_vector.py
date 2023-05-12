num=int(input("Ingrese la dimensión del vector: "))

vec1=[]
vec2=[]
vec_res=[]

for i in range (num):
    nume=int(input("Ingrese el número: "))
    vec1.append(nume)
print(vec1)

for i in range (num):
    nume=int(input("Ingrese el número: "))
    vec2.append(nume)
print(vec2)

for i in range (len(vec1)):
    vec_res.append(vec1[i]+vec2[i])
print(vec_res)
