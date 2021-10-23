def hello(name=""):
    if not name:
        return "Hello, World!"
    else:
        return "Hello, {}!".format(name[0].upper() + name.lower()[1:len(name)])
