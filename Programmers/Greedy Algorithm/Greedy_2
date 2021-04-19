#프로그래머스
#탐욕법_조이스틱
#level_2

def solution(name):
    alphabet = ['A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'] 
    name = list(name)
    stick_mv = [min(alphabet.index(n),26-alphabet.index(n)) for n in name]
    answer = sum(stick_mv)

    idx = 0
    while True:
        stick_mv[idx] =0
        print(stick_mv)
        if sum(stick_mv) == 0:
            break
        left,right = 1,1
        while stick_mv[idx-left] == 0:
            left +=1
        while stick_mv[idx+right] == 0:
            right +=1
        
        idx += -left if left<right else right
        answer += min(left,right)
    return answer
