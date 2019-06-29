s = input()
orig = ""
l = len(s)

if l % 2 == 0:
    even = int(l/2)
    odd = 0
    while even != l:
        orig = orig + str(s[even]) + str(s[odd])
        even = even+1
        odd = odd+1
else:
    odd = int(l / 2)
    even = 0
    while odd != l:
        if odd != l-1:
            orig = orig + str(s[odd]) + str(s[even])
        else:
            orig = orig + str(s[odd])
        even = even + 1
        odd = odd + 1
print(orig)
