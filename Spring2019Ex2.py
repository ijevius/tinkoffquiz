letters = set()
string = input()

for c in string:
    if string.count(c) > 1:
        letters.add(c)
for c in letters:
    print(c, end='')
