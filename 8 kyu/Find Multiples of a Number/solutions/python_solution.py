def find_multiples(integer, limit):
    return [(i + 1) * integer for i in range(int(limit / integer))]