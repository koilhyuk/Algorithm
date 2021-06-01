# python
month = ("FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU")
monthDay = [0 for i in range(12)]
monthFlg = True
totalDays = 0
for i in range(len(monthDay)):
    monthFlg = (i%2==0 if i <=6 else i%2==1)
    if i==1:
        monthDay[i] = 29
        continue
    monthDay[i]=(31 if monthFlg else 30)

for j in range(a-1):
    totalDays+=monthDay[j]
totalDays+=b-1
return month[totalDays%7]
