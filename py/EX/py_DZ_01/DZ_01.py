# Напишите программу, которая принимает на вход цифру, обозначающую день недели, и проверяет, является ли этот день выходным.

# Пример:

# - 6 -> да
# - 7 -> да
# - 1 -> нет

number_of_days_in_a_week = 7
weekdays = 5
print("Введите номер дня недели")
number = int(input())
if number <= number_of_days_in_a_week:
    if number > weekdays:
        print('является выходным')
    else:
        print('не является выходным')
else:
    print('вы ввели неверный день недели')
