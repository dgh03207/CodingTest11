#programmers
#월간 코드 챌린지 시즌2 _ 음양 더하기

def solution(absolutes, signs):
    
    answer = 0
    for n in range(len(signs)):
        
        if signs[n] == True:
            answer += absolutes[n]
        elif signs[n] == False:
            answer -= absolutes[n]
            
    return answer