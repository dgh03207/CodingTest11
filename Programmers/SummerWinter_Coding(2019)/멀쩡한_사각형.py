#programmers
#Summer/Winter Coding(2019)_멀쩡한 사각형

from math import gcd 

def solution(w,h):
    
    if gcd(w,h)==1:
        a = max(w,h)//min(w,h)
        answer = w*h-a*min(w,h)
        
    else:
        answer = w*h-min(w,h)*2
        
    return answer