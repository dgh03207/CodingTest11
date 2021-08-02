#programmers
#월간 코드 챌린지 시즌2_약수의 개수와 덧셈

def solution(left, right):

    answer = 0
    
    for num in range(left,right+1):
        cnt = 0
        for n in range(1,num+1):
            if num % n == 0:
                cnt += 1
        
        if cnt %2 == 0:
            answer += num
        else:
            answer -= num
            
    return answer
            