#programmers
#월간 코드 챌린지 시즌1_내적

def solution(a, b):
    
    result = []
    for n in range(len(a)):
        result.append(a[n]*b[n])
        
    return sum(result)