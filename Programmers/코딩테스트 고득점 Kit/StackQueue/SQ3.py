# import math

# days = []
# answer = []
# def solution(progresses, speeds):
#     count = 0
#     for n in range(len(progresses)):
#         days.append(math.ceil(float((100-progresses[n])/speeds[n])))
    
#     standard = days[0]
#     count = 0
#     for i in range(1,len(days)):
#         if standard < days[i]:
#             standard = days[i]
#             answer.append(count+1)
#             count = 0
#             if days[i] == days[len(days)-1]:
#                 answer.append(count+1)
#         elif standard > days[i] or standard == days[i]:
#             count = count + 1
#             if i+1 == len(days):
#                 answer.append(count+1)
        
#     return answer

def solution(progresses, speeds):
    Q=[]
    for p, s in zip(progresses, speeds):

        if len(Q)==0 or Q[-1][0]<-((p-100)//s):
            Q.append([-((p-100)//s),1])
        else:
            Q[-1][1]+=1
            
    return [q[1] for q in Q]