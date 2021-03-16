#프로그래머스
#탐욕법_단속카메라
#level_3

def solution(routes):
    answer = 1
    routes.sort(key = lambda x: x[0])
    target = routes[0]
    for route in routes[1:]:

        if route[1] <= target[1]:
            target[1] = route[1]
            pass
        elif route[0]> target[1]:
            answer+=1
            target = route

    return answer
