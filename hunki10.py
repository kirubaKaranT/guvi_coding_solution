
n=int(input())
a=list(map(int,input().split()))
m=int(input())
b=list(map(int,input().split()))
kk=True
for i in range(0,m):
  if(b[i] not in a):
    kk=False

if(kk):
  print("YES")
else:
  print("NO")
