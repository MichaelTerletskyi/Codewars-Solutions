def distinct(seq):
    arr = []
    for i in seq:
        if not (arr.__contains__(i)):
            arr.append(i)
    return arr