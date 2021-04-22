#programmers
#lv1_이상한 문자 만들기

def solution(s):
    
    answer = ""
    
    for word in s.split(' '):
        for n in range(len(word)):
            if n%2 == 0:
                answer += list(word)[n].upper()
            else:
                answer += list(word)[n].lower()
        answer += ' '
        
    return answer[:-1]
    