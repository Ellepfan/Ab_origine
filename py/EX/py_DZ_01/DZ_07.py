# 4. Пользователь вводит целое положительное число.
#  Найдите самую большую цифру в числе.
#  Для решения используйте цикл while и арифметические операции.

import math

print("Введите целое положительное число")
number = int((input()))

max = 0
while number > 0:
    if number % 10 > max:
        max = number % 10
    number = math.trunc(number / 10)

print(max)
