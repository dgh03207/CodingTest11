#programmers
#lv1_정수 제곱근 판별

def solution(n):
    for i in range(1,n+1):
        if n==i*i:
            return (i+1)*(i+1)
        
    return -1