#programmers
#lv1_행렬의 덧셈

def solution(arr1, arr2):
    
    for n in range(len(arr1)):
        for i in range(len(arr1[n])):
            arr1[n][i] += arr2[n][i]
    
    return arr1