#programmers
#2020 카카오 인턴십_ 수식 최대화

def solution(expression):

    operator = []
    
    while '-' in expression or '*' in expression or '+' in expression:
        if '-' in expression:
            expression = expression.replace('-','/')
            operator.append('-')
        elif '*' in expression:
            expression = expression.replace('*','/')
            operator.append('*')
        elif '+' in expression:
            expression = expression.replace('+','/')
            operator.append('+')
            
    expression = expression.split('/')
    
    
    
    
    
    
    
    
    print(expression,operator)