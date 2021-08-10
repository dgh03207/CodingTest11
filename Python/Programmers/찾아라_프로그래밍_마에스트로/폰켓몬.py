#programmers
#찾아라 프로그래밍 마에스트로_폰켓몬



def solution(nums):
    answer = []
    for num in nums:
        if len(answer) == len(nums)/2:
            return len(answer)
        else:
            if not num in answer:
                answer.append(num)
                
    return len(answer)