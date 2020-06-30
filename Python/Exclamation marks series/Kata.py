def balance(left, right):
    sum1 = left.count('!')*2 + left.count('?')*3
    sum2 = right.count('!')*2 + right.count('?')*3
    if sum1 == sum2:
        return "Balance"
    elif sum1 > sum2:
        return "Left"
    elif sum1 < sum2:
        return "Right"
    else:
        return None