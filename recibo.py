from prettytable import PrettyTable


print('--------------BEM-VINDO A AMILTON SHOPPING--------------\n')
table = PrettyTable(['Nome do Produto', 'Preco do Produto'])
total = 0

while (1):
    name = input('Introduz nome do produto:\n')

    if (name != 'n'):
        price = int(input('Introduz Preco do Produto:\n'))

        total += price
        table.add_row([name, price])
        continue
    elif (name == 'n'):
        break

table.add_row(['TOTAL', total])
print(table)
print('O seu gasto total foi:', total, 'MZN')
print('\nObrigado pela preferencia volte mais. :)')