def validate_hello(greetings):
    if "hello" in greetings.lower() or "salut" in greetings.lower() or "ciao" in greetings.lower() or "hallo" in greetings.lower() or "hola" in greetings.lower() or "ahoj" in greetings.lower() or "czesc" in greetings.lower(): return True
    return False