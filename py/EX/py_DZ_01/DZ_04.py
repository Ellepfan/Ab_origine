# Напишите программу, которая по заданному номеру четверти, показывает диапазон возможных координат точек в этой четверти (x и y).

print("Введите номер четверти")
quarter_number = int(input())

if quarter_number >= 1 and quarter_number <= 4:
    if quarter_number == 1:
        print("x > 0 y > 0")
    elif quarter_number == 2:
        print("x > 0 y < 0")
    elif quarter_number == 3:
        print("x < 0 y < 0")
    elif quarter_number == 4:
        print("x < 0 y > 0")
else:
    print("вы ввели неверный номер четверти")
