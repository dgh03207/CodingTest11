#programmers
#Summer/Winter Coding(~2018)_스킬트리

def solution(skill, skill_trees):
    
    skill_trees = list(map(list,skill_trees))
    wrong_cnt = 0
    
    for skill_tree in skill_trees:
        prev_skill = -1
        
        for s in list(skill):
            
            if s in skill_tree:
                
                target = skill_tree.index(s)
                
                if prev_skill > target:
                    wrong_cnt +=1
                    break
                else:
                    prev_skill = target
            else:
                prev_skill = float('inf')

                
    return len(skill_trees)-wrong_cnt
                