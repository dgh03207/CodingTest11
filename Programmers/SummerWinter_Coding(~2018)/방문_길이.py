#programmers
#Summer/Winter Coding(~2018)_방문 길이


def solution(dirs):
    x,y = 0,0
    
    list_dic = []
    answer = 0
    for d in list(dirs):
        
        prev = [x,y]

        
        if d == 'U':
            if y !=5:
                y+=1
        elif d  == 'D':
            if y !=-5:
                y-=1
        elif d == 'L':
            if x != -5:
                x-=1
        elif d == 'R':
            if x != 5:
                x+=1
        after = [x,y]
        
        if prev != after:
            if [prev,after] not in list_dic and [after,prev] not in list_dic:
                list_dic.append([prev,after])
                answer +=1
    return answer