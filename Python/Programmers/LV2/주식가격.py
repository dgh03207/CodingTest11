#programmers
#lv2_주식가격

#유효성 실패

def solution(prices):
    
    answer = []
    for i in range(len(prices)):
        time = -1
        for price in prices[i:]:
            time += 1
            if prices[i]>price:
                break
        answer.append(time)
        
    return answer