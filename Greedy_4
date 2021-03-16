#프로그래머스
#탐욕법_구명보트
#level_2

def solution(people, limit):
    people = sorted(people,reverse = True)
    boat_cnt = 0
    l =0
    r = len(people)-1
    while l <= r:
        boat_cnt +=1
        if people[l]+people[r] <= limit:
            r -= 1
        l += 1
    return boat_cnt
