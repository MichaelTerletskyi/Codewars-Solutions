# A wolf in sheep's clothing

```yaml
Level : 8 kyu
```



# Instructions
Wolves have been reintroduced to Great Britain.
You are a sheep farmer, and are now plagued by wolves which pretend to be sheep.
Fortunately, you are good at spotting them.

Warn the sheep in front of the wolf that it is about to be eaten.
Remember that you are standing at the front of the queue which is at the end of the array:

For example,
```yaml
[sheep, sheep, sheep, sheep, sheep, wolf, sheep, sheep]      (YOU ARE HERE AT THE FRONT OF THE QUEUE)
   7      6      5      4      3            2      1
```

If the wolf is the closest animal to you, return "Pls go away and stop eating my sheep".
Otherwise, return "Oi! Sheep number N! You are about to be eaten by a wolf!" where N is the sheep's position in the queue.

Note: there will always be exactly one wolf in the array.

Examples
```yaml
input: ["sheep", "sheep", "sheep", "wolf", "sheep"]
output: "Oi! Sheep number 1! You are about to be eaten by a wolf!"

Input: ["sheep", "sheep", "wolf"]
Output: "Pls go away and stop eating my sheep"
```

You can find this Kata by [link](https://www.codewars.com/kata/5c8bfa44b9d1192e1ebd3d15/train/scala)