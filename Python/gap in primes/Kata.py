def gap(x, y, z):
    prev_prime = None
    for num in range(y, z + 1):
        if all(num % factor for factor in range(2, int(num ** 0.5) + 1)):
            if prev_prime is not None and num - prev_prime == x:
                return [prev_prime, num]
            prev_prime = num