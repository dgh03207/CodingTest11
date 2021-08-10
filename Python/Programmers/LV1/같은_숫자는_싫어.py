#프로그래머스
#lv1_같은 숫자는 싫어

def solution(arr):
    
    temp = -1
    n = 0
    answer = []
    
    for n in range(len(arr)):
        
        if temp != arr[n]:
            answer.append(arr[n])
        temp = arr[n]
    
    return answer