#programmers
#2017 팁스다운_ 예상 대진표

def solution(n,a,b):
    
    A=max(a,b)
    B=min(a,b)
    n = 1
    while True:
        k = 2**n
        
        if B%k == 0:
            n+=1
            continue
        elif A%k == 0 and A//k-1 == B//k:
            return n
        elif A%k != 0 and A//k == B//k:
            return n
        else:
            n+=1

