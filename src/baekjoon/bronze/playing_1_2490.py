nameArr = ['D','C','B','A','E']
for _ in range(3):
    print(nameArr[list(map(int,input().split())).count(1)])
