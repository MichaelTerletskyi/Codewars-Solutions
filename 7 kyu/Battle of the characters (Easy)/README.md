# Battle of the characters (Easy)

```yaml
Level : 7 kyu
```

# Instructions

Description:
Groups of characters decided to make a battle. Help them to figure out which group is more powerful. Create a function that will accept 2 variables and return the one who's stronger.

Rules:
- Each character have its own power: A = 1, B = 2, ... Y = 25, Z = 26
- Only capital characters can and will participate a battle.
- Only two groups to a fight.
- Group whose total power (A + B + C + ...) is bigger wins.
- If the powers are equal, it's a tie.

Examples:
```yaml
battle("ONE", "TWO"); // => "TWO"`
battle("ONE", "NEO"); // => "Tie!"
```

Related kata: 
[Battle of the characters (Medium)](https://www.codewars.com/kata/595e9f258b763bc2d2000032)

Java kata [link](https://www.codewars.com/kata/595519279be6c575b5000016/train/java)