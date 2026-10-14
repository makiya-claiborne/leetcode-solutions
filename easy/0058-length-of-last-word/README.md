# 58. Length of Last Word

- **Difficulty:** Easy
- **Topics:** String
- **Problem:** [Length of Last Word on LeetCode](https://leetcode.com/problems/length-of-last-word/)

## Approach

I first use `trim()` to remove any spaces from the beginning and end of the
input string. This ensures that the last character belongs to the final word.

I then use `split(" ")` to separate the string into an array of words. The last
word is located at the final position in the array, so I retrieve it and return
its length.

For example, given:

```text
"Hello World"
```

The resulting array contains `"Hello"` and `"World"`. The last word is
`"World"`, which has a length of `5`.

## Complexity Analysis

Let `n` represent the number of characters in the input string.

- **Time Complexity:** O(n), because trimming and splitting require processing
  the characters in the string.
- **Space Complexity:** O(n), because the solution creates a trimmed string and
  an array containing the words.

## Solutions

| Language | Solution                                         | Completed        |
| -------- | ------------------------------------------------ | ---------------- |
| Java     | [LengthOfLastWord.java](./LengthOfLastWord.java) | October 13, 2026 |
| Python   | —                                                | —                |
