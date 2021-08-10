#programmers
#lv1_약수의 합

def solution(n):
    answer = []
    i = 1
    while (i<n+1):
        if n%i == 0:
            answer.append(i)
        i+=1
    return sum(answer)