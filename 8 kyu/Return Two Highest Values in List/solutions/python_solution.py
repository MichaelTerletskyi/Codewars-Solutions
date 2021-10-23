def two_highest(arg1):
    if (len(arg1) == 0): return arg1
    arr = list(set(arg1))
    arr.sort()
    if (len(arr) == 1):
        return [arr[0]]
    else:
        return [arr[len(arr) - 1], arr[len(arr) - 2]]