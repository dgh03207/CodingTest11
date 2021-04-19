import sys
# def solution(phone_book):
#     size = len(phone_book)
#     # choose the standard
#     for a in range(size):
#         part = phone_book[a]
#         if part in phone_book:
#             del phone_book[a]
#             break
#
#     for b in range(len(phone_book)):
#         if part in phone_book[b]:
#             part_size = len(part)
#             target = phone_book[b]
#             if target[0:part_size] == part:
#                 answer = False
#                 break
#
#         else:
#             answer = True
#     return answer
#
#

#효율성 검사에서 탈락한 것
#
# def solution(phone_book):
#     size = len(phone_book)
#     answer = True
#     # choose the standard
#     for a in range(size):
#         part = phone_book[a]
#         part_size = len(part)
#         for b in range(size):
#             if part is not phone_book[b]:
#                 target = phone_book[b]
#                 if target[0:part_size] == part:
#                     answer = False
#
#     return answer

#통과한 풀이(구글링으로 찾았음)

def solution(phone_book):
    answer = True
    #리스트를 오름차순 형태로 정리해준다.
    phone_book.sort()
    n = 0

    for a in range(len(phone_book)):
        target = phone_book[n]
        if phone_book[a] is not target:
            if phone_book[a][:len(target)] == target:
                answer = False
            else:
                n = n + 1

    return answer

    # for a in range(len(phone_book)):
    #     if phone_book[a][:len(list)] == list:
    #         answer = False

    return answer


if __name__ == "__main__":
    phone_book=[]
    phone_book = sys.stdin.readline().split()
    print(solution(phone_book))