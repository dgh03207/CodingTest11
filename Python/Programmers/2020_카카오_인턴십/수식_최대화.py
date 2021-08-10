#programmers
#2020 카카오 인턴십_ 수식 최대화

import re
from itertools import permutations

def solution(expression):
    
    priorities = [['-','*','+'],['-','+','*'],['+','-','*'],['+','*','-'],['*','+','-'],['*','-','+']]
    
    priorities = set(re.findall('\D',expression))
    priorities = permutations(priorities)
    cand = []
    
    for priority in priorities:
        temp = re.compile("(\D)").split(expression)
        for pri in priority:
            while pri in temp:
                idx = temp.index(pri)
                temp = temp[:idx-1] + [str(eval(''.join(temp[idx-1:idx+2])))]+temp[idx+2:]
        
        cand.append(abs(int(temp[0])))            
            
    return max(cand)


# 코드 출처 : https://velog.io/@tjdud0123/%EC%88%98%EC%8B%9D-%EC%B5%9C%EB%8C%80%ED%99%94-2020-%EC%B9%B4%EC%B9%B4%EC%98%A4-%EC%9D%B8%ED%84%B4%EC%8B%AD-%EB%AC%B8%EC%A0%9C