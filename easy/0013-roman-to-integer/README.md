# 13. Roman to Integer

- **Difficulty:** Easy
- **Topics:** Hash Table, Math, String
- **Problem:** [Roman to Integer on LeetCode](https://leetcode.com/problems/roman-to-integer/)

## Approach

I process the Roman numeral one character at a time while keeping track of the
current symbol and the symbol that follows it.

Normally, the value of the current symbol is added to the total. However, Roman
numerals use subtraction in the following cases:

- `I` before `V` or `X`
- `X` before `L` or `C`
- `C` before `D` or `M`

When one of these combinations occurs, I subtract the value of the current
symbol instead of adding it. After processing a symbol, I remove it from the
beginning of the string and continue until the string is empty.

For example, `MCM` is evaluated as:

- `M` adds 1,000
- `C` before `M` subtracts 100
- `M` adds 1,000
- Total: 1,900

## Complexity Analysis

Let `n` represent the number of characters in the Roman numeral.

- **Time Complexity:** O(n²), because each call to `substring(1)` creates a new
  string containing the remaining characters.
- **Space Complexity:** O(n), because new substring objects are created while
  processing the Roman numeral.

An index-based implementation could process the string in O(n) time and O(1)
additional space.

## Solutions

| Language | Solution | Completed |
|---|---|---|
| Java | [RomanToInteger.java](./RomanToInteger.java) | October 10, 2026 |
| Python | — | — |
