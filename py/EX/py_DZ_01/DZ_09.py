# 6. Если фирма отработала с прибылью, вычислите рентабельность выручки. 
# Это отношение прибыли к выручке. 
# Далее запросите численность сотрудников фирмы 
# и определите прибыль фирмы в расчёте на одного сотрудника.

print("Введите значение выручки")
revenue = float(input())

print("Введите значение издержек")
costs = float(input())

if revenue > costs:
    print('прибыль — выручка больше издержек')

    profitability = revenue / costs
    print('рентабельность выручки =',+ profitability)
    
    print('Введите численность сотрудников фирмы')
    number_of_employees = int(input())
    company_profit_per_employee = profitability / number_of_employees
    print('Прибыль фирмы в расчёте на одного сотрудника', + company_profit_per_employee)


elif revenue < costs:
    print('убыток — издержки больше выручки')