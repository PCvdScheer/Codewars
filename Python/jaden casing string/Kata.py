def toJadenCase(string):
    data = string.split()
    answer = [] 
    for i in data:
        temp = i.capitalize() + ' '
        answer.append(temp)
        
    update = ''.join(answer)
    update_1 = update[0:-1]
    return update_1