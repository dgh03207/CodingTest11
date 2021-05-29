#programmers
#찾아라 프로그래밍 마에스트로_게임 맵 최단거리



from collections import deque


def solution(maps):
    
    d = [[1,0],[0,1],[-1,0],[0,-1]] 
    visited = [[-1 for _ in range(len(maps))] for _ in range(len(maps[0]))]

    if maps[-1][-2] == 0 and maps[-2][-1] == 0:
        return -1
    else:
        
        x,y = 0,0
        queue = deque()
        queue.append([x,y])
        visited[x][y] = 1

        while queue:
            
            x,y = queue.popleft()
            for n in range(4):
                
                xi = x+ d[n][0]
                yi = y+ d[n][1]
                
                if -1<xi<len(maps[0]) and -1<yi<len(maps):
                    if maps[xi][yi] == 1 and visited[xi][yi] == -1:
                        queue.append([xi,yi])
                        visited[xi][yi] = visited[x][y]+1

        return visited[-1][-1]
                        
                        