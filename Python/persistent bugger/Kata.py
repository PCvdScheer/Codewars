import numpy

def persistence(n):
    counter = 0
    my_list = [int(d) for d in str(n)]
    while True:
        if len(my_list) is not 1:
            temp = numpy.prod(my_list)
            print(temp)
            my_list = [int(d) for d in str(temp)]
            counter += 1
        elif len(my_list) ==1:
            break
    return counter