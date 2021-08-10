#programmers
#2017 팁스다운_짝지어 제거하기

def solution(s):
    
    stack = []
    
    for l in s:
        if len(stack)== 0:
            stack.append(l)
        elif stack[-1]== l:
            stack.pop(-1)
        else:
            stack.append(l)
            
    if len(stack)==0:
        return 1
    else:
        return 0