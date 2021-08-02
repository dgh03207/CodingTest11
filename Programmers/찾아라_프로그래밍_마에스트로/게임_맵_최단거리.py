#programmers
#찾아라 프로그래밍 마에스트로_게임 맵 최단거리



from collections import deque


def solution(maps):
    
    d = [[1,0],[-1,0],[0,1],[0,-1]]
    
    visited = [[-1 for _ in range(len(maps[0]))] for _ in range(len(maps))]
    
    x,y = 0,0
    queue = deque()
    queue.append([y,x])
    visited[y][x] = 1
    
    while queue:
        y,x= queue.popleft()
        
        for n in range(4):
            yi = y+d[n][0]
            xi = x+d[n][1]
            
            if -1<yi<len(maps) and -1<xi<len(maps[0]):
                if maps[yi][xi] == 1 and visited[yi][xi] == -1:
                    visited[yi][xi] = visited[y][x] +1
                    queue.append([yi,xi])
                    
    
    return visited[-1][-1]