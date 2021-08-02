#프로그래머스
#완전탐색_소수 찾기
#level 2

from itertools import permutations
import math

def solution(numbers):
    number_list = []
    for n in range(1,len(numbers)+1):
        number_list += list(set(map(int,map(''.join,permutations(list(numbers),n)))))
    number_list = sorted(list(set(number_list)))
    
    answers = 0
    cnt = 0
    
    for num in number_list:
        if num>1:
            for i in range(2,num):
                cnt = 0
                if num%i == 0:
                    cnt +=1
                    break
            if cnt == 0:
                answers += 1
                
    return answers
