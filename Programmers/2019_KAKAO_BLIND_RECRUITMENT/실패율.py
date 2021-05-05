#programmers
#2019 KAKAO BLIND RECRUITMENT_실패율

from collections import Counter


def solution(N, stages):
    n =1
    length = len(stages)
    stages = Counter(sorted(stages))
    result = []
    
    while(n<N+1):
        if length == 0:
            result.append([n,0])
        else:
            result.append([n,stages[n]/length])
            length -= stages[n]
        n += 1
        
    result = sorted(result,key = lambda x: x[1],reverse = True)
    
    return [x[0] for x in result]