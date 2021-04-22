#programmers
#lv1_자연수 뒤집어 배열로 만들기

def solution(n):
    return [int(list(str(n))[i]) for i in range(len(str(n))-1,-1,-1)]

    