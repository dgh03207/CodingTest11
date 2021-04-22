#programmers
#월간 코드 챌린지 시즌1_두개 뽑아서 더하기

from itertools import combinations

def solution(numbers):
    answer = []
    num_set = list(combinations(numbers,2))
    
    for num in num_set:
        sum_set = num[0]+num[1]

        if not sum_set in answer:
            answer.append(sum_set)
            
    return sorted(answer)