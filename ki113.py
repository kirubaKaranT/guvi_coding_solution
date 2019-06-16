#
l=list(map(str,input().split("/")))
if len(l[0])==2 and len(l[1])==2 and len(l[2])==4 and int(l[0])>0 and int(l[0])<32 and int(l[1])>0 and int(l[1])<13:
    print("yes")
else:
    print("no")
