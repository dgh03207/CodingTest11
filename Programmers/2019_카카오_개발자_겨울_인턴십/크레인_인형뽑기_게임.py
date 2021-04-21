#프로그래머스
#2019 카카오 개발자 겨울 인턴십_크레인 인형뽑기 게임

def solution(board, moves):
    result = []
    cnt = 0
    for m in moves:
        for n in range(len(board)):
            if board[n][m-1] != 0:
                if len(result) > 0:
                    if board[n][m-1] == result[-1]:
                        result.pop()
                        cnt += 2
                        board[n][m-1] = 0
                        break
                    else:
                        result.append(board[n][m-1])
                        board[n][m-1] = 0
                        break
                else:
                    result.append(board[n][m-1])
                    board[n][m-1] = 0
                    break
                
    return cnt
