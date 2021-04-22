#programmers
#2021 KAKAO BLIND RECRUITMENT_신규 아이디 추천

 def solution(new_id):
    
    answer = ""
    
    new_id = list(new_id)
    
    for text in new_id:
        if text.isalpha() or text.isdigit():
            answer += text.lower()
        elif text == '_' or text == '-':
            answer += text
        elif text == '.' and len(answer)>0 and answer[-1] != '.':
                answer += text
    

    if len(answer) == 0:
        return 'aaa'   
    
    while(len(answer)<3 or len(answer) >15 or answer[-1] == '.'):

        if answer[-1] == '.':
            answer = answer[:-1]
        if len(answer) >15:
            answer = answer[:15]
        if len(answer) <3:
            answer += answer[-1]*(3-len(answer))

    
    return answer