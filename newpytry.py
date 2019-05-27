n=int(input())
i=0
globlis=[]
while(i<n):
    lis=list(map(int,input().split(" ")))
    globlis.extend(lis)
    i=i+1

globlis.sort() 
i=0
while(i<len(globlis)):
    print(globlis[i],end=" ")
    i+=1
