a = int(input())
b = [round(float(input())*0.8,2) for _ in range(a)]
for i in b:
    print("$%.2f"%(i))
