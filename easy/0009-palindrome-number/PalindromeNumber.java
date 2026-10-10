/**
 * LeetCode 9: Palindrome Number
 *
 * Converts the original number to a string, reverses its digits,
 * and compares the reversed result with the original value.
 *
 * Completed: September 28, 2026
 *
 * Time Complexity: O(d)
 * Space Complexity: O(d)
 *
 * d represents the number of digits in the input.
 */
class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        String originalNumber = String.valueOf(x);
        StringBuilder reversedNumber = new StringBuilder();

        do {
            int currentDigit = x % 10;
            reversedNumber.append(currentDigit);
            x /= 10;
        } while (x > 0);

        return reversedNumber.toString().equals(originalNumber);
    }
}
