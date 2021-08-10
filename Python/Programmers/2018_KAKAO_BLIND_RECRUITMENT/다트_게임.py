#programmers
#2018 KAKAO BLIND RECRUITMENT_[1차]다트게임


def solution(dartResult):
    num = []
    cal = []
    temp_n = ""
    for t in dartResult:
        if t.isdigit():
            temp_n += t
        elif t == 'S' or t=='D' or t=='T':
            cal.append(t)
            if len(temp_n)>0:
                num.append(temp_n)
                temp_n = ""
        elif t == '*' or t=='#':
            cal[-1] = cal[-1]+t
              
    i = 0

    
    while i<len(num):
        if 'S' in cal[i] :
            num[i] = int(num[i])**1
        elif 'D' in cal[i]:
            num[i] = int(num[i])**2
        elif 'T' in cal[i]:
            num[i] = int(num[i])**3
            
        if '*' in cal[i]:
            if i != 0:
                num[i-1] = num[i-1]*2
            num[i] = num[i]*2
        if '#' in cal[i]:
            num[i] = int(num[i])*-1
        
        i+=1
    return sum(num)
            