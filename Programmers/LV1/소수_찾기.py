#프로그래머스
#lv1_소수 찾기

def solution(n):
    num = set(range(2,n+1))

    for i in range(2,n+1):
        if i in num:
            num -= set(range(i*i,n+1,i))
    
<<<<<<< HEAD
    return len(num)
=======
    return len(num)
>>>>>>> dfcb0d03f123f87055c500cb8a70c9f4524ad190
