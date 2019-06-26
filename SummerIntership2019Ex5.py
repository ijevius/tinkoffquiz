import sys

password = ""
b = d = s = False

if len(password) < 8:
    print("NO")
    sys.exit()
else:
    for c in password:
        if ord(c) in range(65, 90+1):
            b = True
        elif ord(c) in range(97, 122+1):
            s = True
        elif c.isdigit():
            d = True
        else:
            print("NO")
            sys.exit()
if b & d & s:
    print("YES")
else: print("NO")
