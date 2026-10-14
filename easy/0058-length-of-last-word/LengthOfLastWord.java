/**
 * LeetCode 58: Length of Last Word
 *
 * Removes leading and trailing spaces from the input string, splits the
 * remaining text into words, and returns the length of the final word.
 *
 * Completed: October 13, 2026
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 * n represents the number of characters in the input string.
 */

public class LengthOfLastWord {
    public static void main(String[] args) {
        String message = "Hello World";
        lengthOfLastWord(message);
    }

    public static int lengthOfLastWord(String message) {
        int length = 0;
        System.out.println("Original message: " + message);
        // Split the message into words to get the last word
        String[] words = message.trim().split(" ");
        if (words.length > 0) {
            String lastWord = words[words.length - 1];
            length = lastWord.length();
            System.out.println("Last word: " + lastWord);
        } else {
            System.out.println("No words found in the message.");
        }
        System.out.println("Length of last word: " + length);
        return length;
    }
}
