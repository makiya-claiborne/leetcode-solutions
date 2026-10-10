# 1. Two Sum

- **Difficulty:** Easy
- **Topics:** Array, Hash Table
- **Problem:** [Two Sum on LeetCode](https://leetcode.com/problems/two-sum/)

## Approach

I use two nested loops to compare each number with every number that appears
after it. If the sum of two numbers equals the target, I return their indices.

Starting the inner loop at `i + 1` prevents an element from being paired with
itself and avoids checking the same pair twice.

## Complexity Analysis

- **Time Complexity:** O(n²), because each element may be compared with every
  element after it.
- **Space Complexity:** O(1), because the solution uses only a constant amount
  of additional memory.

## Solutions

| Language | Solution | Completed |
|---|---|---|
| Java | [TwoSum.java](./TwoSum.java) | September 28, 2026 |
| Python | - | - |
