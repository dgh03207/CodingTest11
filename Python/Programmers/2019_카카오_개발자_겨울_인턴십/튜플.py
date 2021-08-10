#programmers
#2019 카카오 개발자 겨울 인턴십_튜플

def solution(s):
    tuples=s.replace('{','',len(s)).rstrip('}').split('},')
    tuples.sort(key = lambda x:len(x))
    
    answer = []
    for tup in tuples:
        for t in tup.split(','):
            if t not in answer:
                answer.append(t)
                
            
    return list(map(int,answer))
    