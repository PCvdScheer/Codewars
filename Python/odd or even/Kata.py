def oddOrEven(arr):
    number = 0
    for i in range(len(arr)):
        number += arr[i]
    print(number)
    if number %2 ==0:
        return "even"
    else:
        return "odd"