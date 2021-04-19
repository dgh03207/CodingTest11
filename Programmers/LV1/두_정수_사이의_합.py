#프로그래머스
#lv1_두 정수 사이의 합

def solution(a, b):
    answer = 0
    for n in range(min(a,b),max(a,b)+1):
        answer += n
    return answer