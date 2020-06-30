def comp(array1, array2):
    a = array1
    b = array2
    if a  == None:
        return False
    elif b == None:
        return False
    elif len(a) is not len(b):
        return False
    a.sort(key = int)  
    b.sort(key = int)
    resi = 0
    for i in range(len(a)):
        resi += abs((a[i]**2)-b[i])
    if resi == 0:
        return True
    else: 
        return False