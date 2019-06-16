import math

k=int(input())
if k==90:
    print("1")
else:
    r=math.radians(k)
    m=(round(math.sin(r),1))
    print(m)
