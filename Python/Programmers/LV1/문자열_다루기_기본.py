#프로그래머스
#lv1_문자열 다루기 기본

def solution(s):
    
    if len(s)==4 or len(s)==6:
        for i in range(len(s)):
            if not s[i].isdigit():
                return False
        return True
    else:
        return False