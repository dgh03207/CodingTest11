#백준


N,M = map(int,input().split())
cards = sorted(list(map(int,input().split())))

answer = cards[:3]

for card in cards[3:]:
    if sum(answer[:2],card)<M:
        answer.pop(0)
        answer.append(card)
    else:
        print(answer) 
        
        

    