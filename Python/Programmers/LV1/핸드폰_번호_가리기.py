#programmers
#lv1_핸드폰 번호 가리기

def solution(phone_number):
    result = "*"*(len(phone_number)-4)+phone_number[-4:]
    
    return result