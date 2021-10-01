# The 'if' function

```yaml
Level : 8 kyu
```

# Instructions

Create a function called _if which takes 3 arguments: a boolean value bool and 2 functions (which do not take any parameters): func1 and func2

When bool is truth-ish, func1 should be called, otherwise call the func2.

Example:

```yaml
void TheTrue() { std::cout << "true" }
void TheFalse() { std::cout << "false" }
_if(true, TheTrue, TheFalse);
// Logs 'true' to the console.
```
 
You can find this Kata by [link](https://www.codewars.com/kata/54147087d5c2ebe4f1000805/train/cpp)