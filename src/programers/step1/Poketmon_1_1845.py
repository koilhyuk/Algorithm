# python
popNum=int(len(nums)/2)
tempSet=set(nums)
setLen=int(len(tempSet))
if setLen>=popNum:answer=popNum else:
	answer= setLen 
print(answer)
