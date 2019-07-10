string = input()
print(''.join(set([c for c in string if string.count(c) > 1])))
