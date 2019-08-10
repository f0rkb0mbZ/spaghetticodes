# d = {'G':'C','C':'G','T':'A','A':'U'}
# try:
#     print("".join([d[x] for x in list(input())]))
# except KeyError:
#     print("Invalid Input")

a='GCTA';b='CGAU'
try:
    print("".join([b[a.index(x)] for x in list(input())]))
except KeyError:
    print("Invalid Input")