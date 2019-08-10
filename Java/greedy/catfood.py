n = int(input())
s = list(map(int, input().split()))
c = list(map(int, input().split()))
s.sort()
c.sort()
sum = 0
for i in range(n):
    sum += s[i] * c[i]
print(sum)