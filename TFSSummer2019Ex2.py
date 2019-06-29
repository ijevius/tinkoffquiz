s = input()
l = len(s)
orig = ''

if l % 2 == 0:
    even = int(l/2)
    odd = 0
    while even != l:
        orig += str(s[even]) + str(s[odd])
        even += 1
        odd += 1
else:
    odd = int(l / 2)
    even = 0
    while odd != l:
        orig += str(s[odd])
        if odd != l-1:
            orig += str(s[even])
        even += 1
        odd += 1

print(orig)
