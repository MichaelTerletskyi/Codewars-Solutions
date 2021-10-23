def define_suit(card):
    ch = card[len(card) - 1]
    if (ch is "C"): return "clubs"
    if (ch is "S"): return "spades"
    if (ch is "D"): return "diamonds"
    else: return "hearts"