score = input()
result =0
if score[:1] == "A":
    result+=4
elif score[:1] == "B":
    result+=3
elif score[:1] == "C":
    result+=2
elif score[:1] == "D":
    result+=1
else:
    result+=0.0

if score[1:] =="+":
    result+=0.3    
elif score[1:] =="0":
    result+=0.0
elif score[1:] =="-":
    result-=0.3
else:
    result+=0.0

print(result)
