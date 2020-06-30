from itertools import combinations
def choose_best_sum(t, k, ls):
    if t >= 0 and k >= 1 and len(ls) >=1 and any(n < 0 for n in ls)==False:
        unique = [",".join(map(str, comb)) for comb in combinations(ls, k)]
        sums = [] 
        value = None
        for i in range(len(unique)):
            temp = unique[i].split(',')
            temp1 = 0
            for j in range(len(temp)):
                temp1 += int(temp[j])
            sums.append(temp1)
        sums.sort(key = int)
        for j in range(len(sums)):
            if sums[j] <= t:
                if value == None:
                    value = sums[j]
                else:
                    if sums[j] >= value:
                        value = sums[j]
        print(value)
        return value
    else:
        raise valueError('Parameters not within limits')