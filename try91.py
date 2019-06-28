from itertools import permutations
s=input()
a="abcdefghijklmnopqrstuvwxyz"
if a==s:
  print(s)
elif s==a[::-1]:
  print("-1")
else:
  s1=tuple(s)
  l=[]
  l=tuple(permutations(s))
  l=sorted(l)
  l1=[]
  for i in range(len(l)):
	  if l[i]>s1:
		  l1.append(l[i])
  if len(l1)!=0:
    print("".join(l1[0]))
  else:
    print(-1)
