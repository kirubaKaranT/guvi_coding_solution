n,p,q,r=map(int,input().split())
l=list(map(int,input().split()))



max=m=i=j=k=0






for i in range(0,n):
    k=j
    for j in range(i,n):
        for k in range(j,n):
            m = (p * l[i]) + (q * l[j]) + (r * l[k])
            if m > max: max = m
print(max)
