#programmers
#2021 KAKAO BLIND RECRUITMENT_메뉴 리뉴얼

from itertools import combinations
from collections import Counter

def solution(orders, course):
    
    answer = []

    for c in course:
        temp = []
        for order in orders:
            temp += combinations(sorted(order),c)
            
        count = Counter(temp)
        if len(count) != 0 and max(count.values()) != 1:
            answer += [''.join(val) for val in count if count[val] == max(count.values())]
     
    return sorted(answer)