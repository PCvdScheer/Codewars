def series_sum(n):
    list = []
    for i in range(n):
        list.append(1/((i*3)+1))
    Sum = sum(list)
    return format(Sum, '.2f')
    