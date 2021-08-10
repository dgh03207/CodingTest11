#프로그래머스
#lv1_가운데 글자 가져오기

def solution(s):
    word = list(s)
    if len(s)%2 == 0:
        return word[int(len(s)//2)-1]+word[int(len(s)//2)]
    
    else:
        return word[len(s)//2]
        
    