#프로그래머스
#lv1_소수 찾기

def solution(n):
    num = set(range(2,n+1))

    for i in range(2,n+1):
        if i in num:
            num -= set(range(i*i,n+1,i))
    
    return len(num)
