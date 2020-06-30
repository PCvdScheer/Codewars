def diamond(n):
    if n < 1 or not n % 2:
        return None
    my_string = ''
    for i in range(n):
        ast = '*'*(i*2 + 1) if i <= n/2 else '*'*((n-i)*2 - 1)
        my_string += ' '*int((n-len(ast)) / 2) + ast + '\n'
    return my_string