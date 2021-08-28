a, b = map(int, input().split())
if a == b:
    if not a and not b:
        print("Not a moose")
    else:
        print("Even "+str(a+b))
else:
    print("Odd "+str(max(a,b)*2))



