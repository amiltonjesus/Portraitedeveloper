import produto


def line(char="="):
    print(char * 48)


def title(msg, char="="):
    line(char)
    print(msg.center(48))
    line(char)


def readInt(msg):

    while True:
        try:
            n = int(input(msg))
        except (ValueError, TypeError):
            print("\033[1;31mERROR! Invalid input.\033[m")
            continue
        except KeyboardInterrupt:
            print("\033[1;31mAction interrupted by the user.\033[m")
            n = 0
            return n
        else:
            return n


def checkInt(val):

    while True:
        try:
            n = int(val)
            return n
        except:
            print("\033[1;31mERROR! Invalid input.\033[m")
            return -1


def readFloat(msg):

    while True:
        try:
            n = float(input(msg).strip().replace(",", "."))
        except (ValueError, TypeError):
            print("\033[1;31mERROR! Invalid input.\033[m")
            continue
        except KeyboardInterrupt:
            print("\033[1;31mAction interrupted by the user.\033[m")
            n = 0
            return n
        else:
            return n


def check(msg):

    multi = 1
    ok = False
    while True:
        n = input(msg)
        if (n.endswith("*")) and n.replace("*", "").isnumeric():
            multi = int(n.replace("*", ""))
        else:
            n = checkInt(n)
            if n != -1:
                cod = n
                ok = True
        if ok:
            return cod, multi  #


def sendToCart(cod, multi=1):
    exists = False
    cart = []
    if cod == 0:
        return 0
    else:
        for p in produto.prods:
            if cod == p["cod"]:
                cart.append(p)
                cart.append(multi)
                exists = True
        if exists is False:
            return -1
        else:
            return cart