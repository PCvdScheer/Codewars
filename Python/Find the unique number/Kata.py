import numpy
def find_uniq(arr):
    counts = numpy.unique(arr)
    for i in range(len(counts)):
        if arr.count(counts[i]) == 1:
            return counts[i]