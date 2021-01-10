import sys

def solution(phoneBook):
    phoneBook = sorted(phoneBook)
    print(phoneBook)

    for p1, p2 in zip(phoneBook, phoneBook[1:]):
        print(p1,p2)
        if p2.startswith(p1):
            print(p1,p2)
            return False
    return True

if __name__ == "__main__":
    phone_book=[]
    phone_book = sys.stdin.readline().split()

    print(solution(phone_book))