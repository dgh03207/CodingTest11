#프로그래머스
#탐욕법_섬 연결하기
#level_3

def solution(n, costs):
    answer = 0
    costs.sort(key=lambda x:x[2])
    nodes = set([costs[0][0]])
    print(costs,n)
    i =0
    while len(nodes)!= n:
        if len(costs)==0:
            return answer
        target = costs[i]
        if target[0] in nodes and target[1] in nodes:
            i+=1
            continue
        if target[0] in nodes or target[1] in nodes:
            nodes.update([target[0],target[1]])
            answer+=target[2]
            costs.pop(i)
            i = 0
        else:
             i+=1
        print (target,nodes,answer)
    return answer
