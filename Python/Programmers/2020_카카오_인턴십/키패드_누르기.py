#programmers
#2020 카카오 인턴십_키패드 누르기


def solution(numbers, hand):
    
    result = ""
    l_loc = 10
    r_loc = 12
    
    for num in numbers:
        if num in [1,4,7]:
            result += 'L'
            l_loc = num
        elif num in [3,6,9]:
            result += 'R'
            r_loc = num
        else:
            if num == 0:
                num = 11
                
            
            absL = abs(num-l_loc)
            absR = abs(num-r_loc)
            
            if sum(divmod(absL, 3)) > sum(divmod(absR, 3)):
                result+='R'
                r_loc = num
            elif sum(divmod(absL, 3)) < sum(divmod(absR, 3)):
                result +='L'
                l_loc = num
            else:
                if hand == 'left':
                    result+='L'
                    l_loc = num
                else:
                    result+='R'
                    r_loc = num

    return result