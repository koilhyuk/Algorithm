hr, mt = map(int, input().split())
mt += int(input())
if mt >=60:
    hr+=mt//60
    mt %= 60
    if hr > 23:
        hr -=24
print(hr,mt)
