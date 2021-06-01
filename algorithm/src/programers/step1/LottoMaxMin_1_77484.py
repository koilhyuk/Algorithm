# python solution
answer = [0,0]
	    
maxNum = 0
minNum = 0
for i in lottos:
    if (win_nums.count(i) or i ==0) :
        maxNum+=1        
    if win_nums.count(i):
        minNum+=1
        
answer[0]= 6 if not maxNum else 7-maxNum
answer[1]= 6 if not minNum else 7-minNum
return answer
