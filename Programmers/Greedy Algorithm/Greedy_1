#프로그래머스
#탐욕법_체육복
#level_2



def solution(n, lost, reserve):
    
    cnt = 0
    zero_suit = [n for n in lost if n not in reserve]
    two_reserve= [m for m in reserve if m not in lost]
    rest = n-len(zero_suit)
    
    for n in zero_suit:
        if len(two_reserve)>0:
            if n-1 in two_reserve:
                two_reserve.remove(n-1)
                cnt +=1
            elif n+1 in two_reserve:
                two_reserve.remove(n+1)
                cnt +=1 
    
    return cnt+rest
