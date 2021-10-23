# Exclamation marks series #6: Remove n exclamation marks in the sentence from left to right

```yaml
Level : 8 kyu
```

# Instructions

Description:
Remove n exclamation marks in the sentence from left to right. n is positive integer.

Examples

```yaml
remove("Hi!",1) === "Hi"
remove("Hi!",100) === "Hi"
remove("Hi!!!",1) === "Hi!!"
remove("Hi!!!",100) === "Hi"
remove("!Hi",1) === "Hi"
remove("!Hi!",1) === "Hi!"
remove("!Hi!",100) === "Hi"
remove("!!!Hi !!hi!!! !hi",1) === "!!Hi !!hi!!! !hi"
remove("!!!Hi !!hi!!! !hi",3) === "Hi !!hi!!! !hi"
remove("!!!Hi !!hi!!! !hi",5) === "Hi hi!!! !hi"
remove("!!!Hi !!hi!!! !hi",100) === "Hi hi hi"
```

Java kata [link](https://www.codewars.com/kata/57faf7275c991027af000679/train/java)