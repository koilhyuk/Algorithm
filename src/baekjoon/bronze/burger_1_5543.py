burMin  = 2000
beverMin =2000

for _ in range(3):
    temp1 = int(input())
    burMin = (temp1 if burMin > temp1 else burMin)

for _ in range(2):
    temp2= int(input())
    beverMin= (temp2 if beverMin > temp2 else beverMin)
    
print(burMin+ beverMin-50)
