#프로그래머스
#완전탐색_ 모의고사
#level 1


def solution(answers):
    Lists = [
        [1,2,3,4,5],
        [2,1,2,3,2,4,2,5],
        [3,3,1,1,2,2,4,4,5,5]
    ]
    answer_count = []
    
    for n in range(0,3):
        count = 0
        for m in range(len(answers)):
            if answers[m] == Lists[n][m%len(Lists[n])]:
                count = count + 1
        answer_count.append(count)
    
    return [n for n,ans in enumerate(answer_count,start=1) if ans == max(answer_count)]
