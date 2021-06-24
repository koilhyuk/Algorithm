a,b= map(int,input().split())

if b<3:
    print("NEWBIE!")
else:
    if b<=a:
        print("OLDBIE!")
    else:
        print("TLE!")
