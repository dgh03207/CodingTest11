#프로그래머스
#lv1_2016

import datetime

def solution(a, b):
    days = ["MON","TUE","WED","THU","FRI","SAT","SUN"]

    return days[datetime.date(2016,a,b).weekday()]