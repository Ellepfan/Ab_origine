# 6. Узнайте у пользователя число n. Найдите сумму чисел n + nn + nnn.
# Например, пользователь ввёл число 3. Считаем 3 + 33 + 333 = 369.

print("Введите число")
number = (input())
number_1 = number + number
number_2 = number_1 + number

number = int(number)
number_1 = int(number_1)
number_2 = int(number_2)
sum = number + number_1 + number_2
print('sum =', + sum)
