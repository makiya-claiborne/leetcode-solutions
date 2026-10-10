/**
 * LeetCode 1: Two Sum
 *
 * Uses a nested-loop approach to test each unique pair of numbers.
 *
 * Time Complexity: O(n^2)
 * Space Complexity: O(1)
 * Completed: September 28, 2026
 */
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            int value = nums[i];

            for (int j = i + 1; j < nums.length; j++) {
                if (value + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }

        return new int[0];
    }
}
