import re
def reverse_alternate(string):
    temp = re.sub (' +', ' ', string)
    temp = temp.split(' ')
    out = []
    for i in range(len(temp)):
        if (i+1) %2==0:
            out.append(temp[i][::-1])
        else: 
            out.append(temp[i])
    out1 = ' '.join(out)
    return out1.strip()