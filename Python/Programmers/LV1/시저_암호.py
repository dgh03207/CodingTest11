<<<<<<< HEAD
#프로그래머스
#lv1_시저 암호

=======
#programmers
#lv1_시저 암호


>>>>>>> dfcb0d03f123f87055c500cb8a70c9f4524ad190
upperLine = ['A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z']
lowerLine = ['a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z']
def solution(s, n):
    answer = ""
    for word in list(s):
        if word in upperLine:
            index = upperLine.index(word)
            answer += upperLine[(index+n)%26]
        elif word in lowerLine:
            index = lowerLine.index(word)
            answer += lowerLine[(index+n)%26]
        else:
            answer += word
    
<<<<<<< HEAD
=======
    print(answer)
>>>>>>> dfcb0d03f123f87055c500cb8a70c9f4524ad190
    return answer