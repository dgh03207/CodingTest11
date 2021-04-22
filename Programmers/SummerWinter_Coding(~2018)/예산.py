#programmers
#Summer/Winter Coding(~2018)_예산

def solution(d, budget):
    d = sorted(d)
    cnt = 0
    for money in d:
        budget-= money
        if budget >= 0:
            cnt +=1
        else:
            break
            
    return cnt
            