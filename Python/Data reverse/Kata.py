def data_reverse(data):
    temp = []
    for i in range(int(len(data)/8)):
        temp.append(data[i*8:i*8+8])
    temp2 = temp[::-1]
    out = [item for t in temp2 for item in t]
    return out