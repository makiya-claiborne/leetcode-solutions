# 9. Palindrome Number

- **Difficulty:** Easy
- **Topics:** Math
- **Problem:** [Palindrome Number on LeetCode](https://leetcode.com/problems/palindrome-number/)

## Approach

I first return `false` for negative numbers because the negative sign prevents
the number from being a palindrome.

For a nonnegative number, I save its original value as a string. I then use
modulo division to retrieve each digit from right to left and append it to a
`StringBuilder`. After reversing all the digits, I compare the reversed value
with the original number.

A `do-while` loop ensures that zero is handled correctly.

## Complexity Analysis

Let `d` represent the number of digits in the input.

- **Time Complexity:** O(d), because each digit is processed once.
- **Space Complexity:** O(d), because the original and reversed values are
  stored as strings.

## Solutions

| Language | Solution | Completed |
|---|---|---|
| Java | [PalindromeNumber.java](./PalindromeNumber.java) | September 28, 2026 |
| Python | — | — |
