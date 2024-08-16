# Напишите программу, которая принимает на вход координаты двух точек и находит расстояние между ними в 2D пространстве.

# Пример:

# - A (3,6); B (2,1) -> 5,09
# - A (7,-5); B (1,-1) -> 7,21

import math

print("Введите координаты точки A")
coordinate_A_1 = input().split()
coordinate_A_2 = input().split()
coordinate_A = coordinate_A_1 + coordinate_A_2


print("Введите координаты точки B")
coordinate_B_1 = input().split()
coordinate_B_2 = input().split()
coordinate_B = coordinate_B_1 + coordinate_B_2


print('A'+'(' + coordinate_A[0] + ';' + coordinate_A[1] + ')')
number_A_1 = int(coordinate_A[0])
number_A_2 = int(coordinate_A[1])


print('B'+'(' + coordinate_B[0] + ';' + coordinate_B[1] + ')')
number_B_1 = int(coordinate_B[0])
number_B_2 = int(coordinate_B[1])

distance_between_points =math.sqrt((number_B_1 - number_A_1) **2 + (number_B_2 - number_A_2)**2)

distance_between_points= round(distance_between_points, 2)

print('Расстояние между двумя точками:')
print(distance_between_points)

