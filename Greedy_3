#프로그래머스
#탐욕법_큰수만들기
#level_2

def solution(number, k):
    numbers = list(map(int,list(number)))
    answer = []
    answer.append(numbers.pop(0))
    
    for num in numbers:
        while len(answer)>0 and answer[-1]< num and  k>0:
            k -= 1
            answer.pop()
        answer.append(num)
    
    if not k == 0:
        answer = answer[:-k]
        
    return "".join(map(str,answer))
