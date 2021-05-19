#programmers
#Summer/Winter Coding(2019)_멀쩡한 사각형
from math import gcd

def solution(w,h):
    
    return w*h-(w+h-gcd(w,h))
    