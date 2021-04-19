#프로그래머스
#lv1_나누어 떨어지는 숫자 배열

def solution(arr, divisor):
    answer = []
    for num in arr:
        if num%divisor == 0:
            answer.append(num)
    
    if len(answer) == 0:
        answer.append(-1)
    
    return sorted(answer)