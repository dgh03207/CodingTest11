#programmers
#월간 코드 챌린지 시즌1_3진법 뒤집기

def solution(n):
    result = ""
    while(n>0):
        print(n)
        n,r = divmod(n,3)
        result += str(r)
        
    return int(result,3)