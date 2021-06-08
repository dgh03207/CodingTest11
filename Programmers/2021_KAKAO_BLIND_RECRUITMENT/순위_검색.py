#programmers
#2021 KAKAO BLIND RECRUITMENT_순위 검색
#실패코드_효율성 실패


import re

def solution(info, query):
    
    answer = []
    
    p = re.compile('[\d]')

    
    
    a,b = 0,0
    
    while a<len(info) or b<len(query):
        
        target = query[a].replace(' and ','/')
        st = p.search(target).start()
        score = int(target[st:])
        
        
        
    
    for que in query:
        que = que.replace(' and ','/')
        st = p.search(que).start()
        score = int(que[st:])
        

        cnt = 0
        for cand in info:
            cand = cand.replace(' ','/',len(que))
            st_c = p.search(cand).start()
            score_c = int(cand[st_c:])
            
            
            if score <= score_c:
                
                if que[:st] == cand[:st_c]:
                    cnt += 1
                elif '-' in que[:st]:
                    enter,enter_c = 0,0 
                    n =0
                    check = False
                    temp_q = que[:st]
                    temp_c = cand[:st_c]
                    
                    while n<4:
                        n+=1
                        enter = temp_q.find('/')
                        enter_c = temp_c.find('/')

                        if temp_q[:enter] == temp_c[:enter_c] or temp_q[:enter]=='-':
                            check = True
                        else:
                            check = False
                            break
                            
                        temp_q = temp_q[enter+1:]
                        temp_c = temp_c[enter_c+1:]
                    
                    if check == True:
                        cnt += 1

        answer.append(cnt)

    return answer