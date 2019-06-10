n=int(input())
arr=list(map(int,input().split()))
zero=max(arr)
u=0
v=0
for i in range(0,n):
  for j in range(i+1,n):
    if(abs(arr[i]+arr[j])<zero):
      u=arr[i]
      v=arr[j] 
      zero=abs(arr[i]+arr[j])
print(u,v)
