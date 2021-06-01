# python solution

def solution(numbers, hand):
    key ={1:[0,0],2:[0,1],3:[0,2],4:[1,0],5:[1,1],6:[1,2],7:[2,0],8:[2,1],9:[2,2],0:[3,1]}

    rHand = [3,2]
    lHand = [3,0]
    answer =[]
    for i in numbers:
        pitIdx = key.get(i)
        if i == 1 or i == 4 or i ==7:
            lHand=pitIdx
            answer.append("L")
        elif i == 3 or i == 6 or i ==9:
            rHand=pitIdx
            answer.append("R")
        else:
            lLen = abs(lHand[0]-pitIdx[0])+abs(lHand[1]-pitIdx[1])
            rLen = abs(rHand[0]-pitIdx[0])+abs(rHand[1]-pitIdx[1])
            if lLen > rLen:
                rHand=pitIdx
                answer.append("R")
            elif lLen < rLen:
                lHand=pitIdx
                answer.append("L")
            else:
                if hand == "right":
                    rHand=pitIdx
                    answer.append("R")
                else:
                    lHand=pitIdx
                    answer.append("L")
    return ''.join(answer)
