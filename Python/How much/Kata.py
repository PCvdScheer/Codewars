def howmuch(m,n):
    my_list = []
    k =1 
    if n < m:
        k = -1
    for i in range(m,n+1,k):
        if i % 9 == 1 and i % 7 ==2:
            my_list.append(["M: %s" % (i), "B: %s" % (round(i/7)), "C: %s" % (round(i/9))])
    return my_list