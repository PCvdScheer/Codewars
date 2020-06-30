def factorial(n):
    if n>12 or 0>n:
        raise ValueError('Provided value not within set limit (0 to 12)')
    elif n == 0:
        return 1
    else:
        mylist = [] 
        for i in range(1,n+1):
            mylist.append(i)
        value = 1
        for x in mylist: 
             value = value * x  
    return value