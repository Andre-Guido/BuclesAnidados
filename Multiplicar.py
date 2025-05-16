'''
Fecha: 16/05/2025.
Autor: André Guido.
Versión: 1.0.
Descripción: Escriba un programa que calcule la tabla de multiplicar del número n,
desde 1 hasta m.
'''
import os
def multiplicar():
    print("TABLA DE MULTIPLICACIÓN")
    n=int(input("Digite el número base de la tabla: "))
    m=int(input("Digite el límite del multiplicador: "))
    os.system("cls")
    print(f"Tabla de multiplicar del 1 hasta {n}")
    for i in range(n+1):
        for j in range(m+1):
            print(f"{i} x {j} = {i*j}")
        print("\n")
multiplicar()