# from collections import deque

def solution(priorities, location):
    queue =  [(i,p) for i,p in enumerate(priorities)]
    answer = 0
    print(queue,answer)
    while True:
        cur = queue.pop(0)
        if any(cur[1] < q[1] for q in queue):           
            queue.append(cur)
        else:
            answer += 1
            if cur[0] == location:
                return answer

#     answer = 0
#     waiting =deque([value,index] for index,value in enumerate(priorities))
    
#     while len(waiting):
#         item = waiting.popleft()
#         if waiting and max(waiting)[0] > item[0]:
#             print(waiting)
#             waiting.append(item)
            
#         else:
#             answer +=1
#             if item[1] == location:
#                 break
#     return answer