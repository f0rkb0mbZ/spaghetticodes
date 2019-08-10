n, m = map(int, input().split())
t = list()
b = list()
print(n)
for i in range(n):
    x, y = map(int, input().split())
    t.append(x)
    b.append(y)

d = dict()

for i in range(n):
    try:
        d[b[i]] = max(t[i], d[b[i]])
    except KeyError:
        d[b[i]] = t[i]
print(sum(d.values()))