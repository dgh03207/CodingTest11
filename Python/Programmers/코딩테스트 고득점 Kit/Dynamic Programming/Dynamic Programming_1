
#프로그래머스 코딩테스트
#동적계획법_N으로 표현
#level_3


def solution(N, number):
    N_set = []
    ans = 0
    for s in range(1,9):
        N_set.append([int(str(N)*s)])
    
    if N== number:
        return 1
    
    for n in range(1,8):
        for m in range(n):
            for a in N_set[m]:
                for b in N_set[n-m-1]:
                    N_set[n].append(a+b)
                    N_set[n].append(a-b)
                    N_set[n].append(a*b)
                    if b !=0:
                        N_set[n].append(a/b)
                    elif a !=0:
                        N_set[n].append(b/a)
        if number in N_set[n]:
            return n+1
        
    return -1
