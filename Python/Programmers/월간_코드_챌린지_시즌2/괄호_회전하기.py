#programmers
#월간 코드 챌린지 시즌2_괄호 회전하기


def solution(s):
    
    line = list(s)
    open_shape = ['(','[','{']
    close_shape = [')',']','}']
    rotate = 0
    result = 0
    
    while( rotate < len(line)):
        stack = []
        check = 0
        for n in range(len(line)):
            check = 0
            
            if line[n] in open_shape:
                stack.append(line[n])
                
            elif line[n] in close_shape:
                
                if len(stack)>0:
                    
                    if stack[-1] == open_shape[close_shape.index(line[n])]:
                        stack.pop()
                        check = 1
                        continue
                    else:
                        check = 0
                        break
                else:
                    check = 0
                    break
                    
        if check == 1 and len(stack) == 0:
            result +=1
        rotate += 1
        line.append(line.pop(0))
    
    return result