def find_children(dancing_brigade):
    my_list = []
    new_list = []
    for i in set(dancing_brigade.lower()):
        my_list.append(i)
    my_list.sort()
    for j in range(len(my_list)):
        new_list.append("{0}{1}".format(my_list[j].upper(),(dancing_brigade.lower().count(my_list[j])-1)*my_list[j].lower()))
    return ''.join(new_list)