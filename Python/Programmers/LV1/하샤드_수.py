#programmers
#lv1_하샤드 수

def solution(x):
    result = 0
    for n in list(str(x)):
        result += int(n)
    
    if x%result==0:
        return True
    else:
        return False