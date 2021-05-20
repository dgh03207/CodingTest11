#programmers
#2020 KAKAO BLIND RECRUITMENT_괄호변환

def test(line):
    storage = []
    for l in line:
        if l=='(':
            storage.append(l)  
        elif l==')':
            if len(storage) > 0:
                if storage.pop() == '(':
                    continue
                else:
                    return False
            else:
                return False
            
    return True


def line_editor(line):
    cnt_l,cnt_r=0,0
    edited = ""

    for l in line:
        if cnt_l>0 and cnt_r>0 and cnt_l==cnt_r:
            return edited
        elif l=='(':
            cnt_l +=1
            edited += l
        elif l==')':
            cnt_r +=1
            edited += l

    return edited

def function(target):
    
    if len(target) == 0:
        return target
    
    elif test(target):
        return target
    
    else:
        origin = target
        u=line_editor(origin)
        v=origin[len(u):]
        if test(u):
            u += function(v)
            return u
        else:
            temp = '('
            temp += function(v)
            temp += ')'
            
            u = u[1:len(u)-1] #양쪽 끝 문자 제거
            for i in range(len(u)):
                if u[i]=='(':
                    temp += ')'
                elif u[i]==')':
                    temp += '('
                    
            return temp

def solution(p):
    
    return function(p)
