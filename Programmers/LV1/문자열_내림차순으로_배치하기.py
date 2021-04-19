#프로그래머스
#lv1_문자열 내림차순으로 배치하기

def solution(s):
    word = list(s)
    word.sort(reverse= True)
    return ''.join(word)