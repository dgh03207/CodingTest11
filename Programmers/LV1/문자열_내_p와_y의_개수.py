#programmers
#lv1_문자열 내 p와 y의 개수

def solution(s):
    answer = True
    p_cnt = 0
    y_cnt = 0
    
    for word in list(s):
        if 'p' in word.lower():
            p_cnt+=1
        if 'y' in word.lower():
            y_cnt+=1
    
    if p_cnt == y_cnt:
        return True
    else:
        return False