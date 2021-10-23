def double_char(s):
    temp = ""
    for i in range(len(s)):
        temp += "".join(s[i] + s[i])

    return temp