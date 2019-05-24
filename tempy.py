si=input()
ti=input()
ci=1
ni=len(si)
for i in range(0,len(ti)-ni,ni):
	if ti[i:i+ni]==si:
		ci=ci+1
print(ci)
