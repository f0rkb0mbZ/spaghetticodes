import re

s = re.split(r'(\s+)', input())
l = [str.capitalize(x) for x in s]
print("".join(l))