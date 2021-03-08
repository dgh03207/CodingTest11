
#프로그래머스
#정렬_H-Index
#level 2

def solution(citations):

    citations.sort()
    c_len = len(citations)
    
    for n in range(c_len):
        
        if citations[n] >= c_len-n:
            return c_len-n
    return 0
    
  
  
