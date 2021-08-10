#programmers
#LV1_x만큼 간격이 있는 n개의 숫자

def solution(x, n):
    result = []
    start = x
    while not len(result) == n:
        result.append(start)
        start+=x
        
        
    return result