#programmers
#KAKAO BLIND RECRUITMENT _ 비밀지도

def solution(n, arr1, arr2):
    
    answer = []
    temp1 = []
    temp2 = []
    for num1,num2 in zip(arr1,arr2):
        binary1 = bin(num1)[2:]
        binary2 = bin(num2)[2:]
        if len(binary1) != n:
            binary1 = '0'*(n-len(binary1))+binary1
        if len(binary2) != n:
            binary2 = '0'*(n-len(binary2))+binary2
            
        temp1.append(binary1)
        temp2.append(binary2)

        
    answer = []
    for bi_1,bi_2 in zip(temp1,temp2):
        temp_solved = ""
        for i in range(n):
            if bi_1[i] == '1' or bi_2[i] == '1':
                temp_solved += '#'
            else:
                temp_solved += ' '
        answer.append(temp_solved)
    return answer

