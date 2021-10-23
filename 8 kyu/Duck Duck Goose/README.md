# Duck Duck Goose

```yaml
Level : 8 kyu
```

# Instructions
The objective of [Duck, duck, goose](https://en.wikipedia.org/wiki/Duck,_duck,_goose) is to walk in a circle, tapping on each player's head until one is chosen.

Task: Given an array of Player objects (an array of associative arrays in PHP) and an index (1-based), return the name of the chosen Player(name is a property of Player objects, e.g Player.name)

Example:

```yaml
duck_duck_goose([a, b, c, d], 1) should return a.name
duck_duck_goose([a, b, c, d], 5) should return a.name
duck_duck_goose([a, b, c, d], 4) should return d.name
```

Java kata [link](https://www.codewars.com/kata/582e0e592029ea10530009ce/train/java)