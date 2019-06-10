n=int(input())
arr=list(map(int,input().split()))
c=0
for i in range(0,len(arr)):
  for j in range(i,len(arr)):
    for k in range(j,len(arr)):
      if(arr[i]>arr[j] and arr[j]>arr[k]):
        c+=1;
print(c)
