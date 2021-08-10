#programmers
#2019 KAKAO BLIND RECRUITMENT_오픈채팅방

def solution(record):
    log = []
    user_dic = {}
    answer = []
    n = 0
    
    for n in range(len(record)):
        msg = list(record[n].split(' '))
        if msg[0] == 'Enter':
            log.append([msg[1],'님이 들어왔습니다.'])
            user_dic[msg[1]] = msg[2]
            
        elif msg[0] == 'Leave':
            log.append([msg[1],'님이 나갔습니다.'])
            
        elif msg[0] == 'Change':
            user_dic[msg[1]]= msg[2]    
            
    
    for uid,line in log:
        answer.append(user_dic[uid]+line)
        
    return answer