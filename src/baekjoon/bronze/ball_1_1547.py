num = int(input())
pot = 1

for _ in range(num):
    lt = list(map(int,input().split()))
    if lt.count(pot):
        if lt[0] != pot:
            pot=lt[0]
        elif lt[1] != pot:
            pot=lt[1]
print(-1 if pot > 3 and pot < 0 else pot)
