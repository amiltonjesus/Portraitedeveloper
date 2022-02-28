import modulo as m
import sys
from datetime import datetime
import os

operation = "VENDA"

data = {
    "name": "AMILTON SHOPPING",
    "adress": "AUTO-ESTRADA, N° 223456, 18 BAIRRO-NDUNDA, BEIRA",
    "NUIT": "345-768-908",
    "contact": "(+258) 847727879 amiltonportraite190403@email.com"
}

cart = []
while True:
    c, mult = m.check("Próximo código: ")
    op = m.sendToCart(c, mult)
    if op == 0:
        break
    elif op == -1:
        print("Código não existente")
    else:
        cart.append(op)


original_stdout = sys.stdout
with open("toPrint.txt", "w") as f:
    sys.stdout = f
    m.line()
    for v in data.values():
        print(v.center(48))
    print(        "\nOperador: AMILTON PORTRAITE".center(48))
    m.line()
    print(operation.center(48))
    m.line("-")
    print(f"{'Produto|Código':<30}{'|Qtd|ValUn|ValTot'}")

    endTot = 0
    qntTot = 0
    for i in cart:

        cod = i[0]["cod"]
        name = i[0]["name"]
        qnt = i[1]
        val = i[0]["valor"]
        tot = qnt * val
        endTot += tot
        qntTot += qnt

        print(name)
        print(f"{cod:<30}|{qnt:>3}|{val:>5.2f}|{tot:>7.2f}")

    m.line("-")

    print(f"N° de itens: {qntTot:0>3}".ljust(24) + f"{'Total: MZN ':>}{endTot:>.2f}".rjust(24))
sys.stdout = original_stdout

print(f"O total é de {endTot}")
pago = m.readFloat("Valor pago: ")
troco = pago - endTot


with open("toPrint.txt", "a") as f:

    sys.stdout = f
    print(f"{'Pago: MZN ':>}{pago:>.2f}".rjust(48))
    print(f"{'Troco: MZN ':>}{troco:>.2f}".rjust(48))
    m.line("-")
    data = str(datetime.today()).replace("-", "/")
    print(data[:19])
    m.line("-")
    print("  --------MUITO OBRIGADO PELA VISITA!-------")
os.startfile("toPrint.txt", "print")

sys.stdout = original_stdout