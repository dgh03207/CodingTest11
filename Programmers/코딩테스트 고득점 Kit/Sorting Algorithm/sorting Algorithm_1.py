
#프로그래머스
#정렬_K번째수
#level 2


def solution(array, commands):
    answer = []
    for n in range(len(commands)):
        slice_object = slice(commands[n][0]-1,commands[n][1],1)
        new_array = sorted(array[slice_object])
        answer.append(new_array[commands[n][2]-1])
    return answer
