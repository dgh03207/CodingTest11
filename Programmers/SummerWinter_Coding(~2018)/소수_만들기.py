#programmers
#Summer/Winter Coding(~2018)_소수 만들기

from itertools import combinations

def solution(nums):

    result = []
    candidates = list(combinations(nums,3))
    for cand in candidates:
        temp_sum = cand[0]+cand[1]+cand[2]
        result.append(temp_sum)
        for i in range(2,temp_sum):
            if temp_sum%i == 0:
                result.pop()
                break
                
    return len(result)
            