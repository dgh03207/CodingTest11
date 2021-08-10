#programmers
#2020 KAKAO BLIND RECRUITMENT_문자열 압축

def solution(s):
    
    answer = s
    
    for i in range(1,len(s)):
        prev = s[0:0+i]
        
        a=0
        cnt = 1
        temp_answer = ""
        
        while a<len(s):
            a=a+i
                
            if prev == s[a:a+i]:
                cnt +=1
            else:
                if cnt == 1:
                    temp_answer += prev
                else:
                    temp_answer += prev+str(cnt)
                
                prev=s[a:a+i]
                cnt = 1
                

    
        if len(temp_answer) < len(answer):
            answer = temp_answer

    return len(answer)