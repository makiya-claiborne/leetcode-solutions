/**
 * LeetCode 13: Roman to Integer
 *
 * Converts a Roman numeral into an integer by processing one symbol at a time.
 * When a symbol appears before a larger valid symbol, its value is subtracted.
 * Otherwise, its value is added to the total.
 *
 * Completed: October 10, 2026
 *
 * Time Complexity: O(n^2)
 * Space Complexity: O(n)
 *
 * n represents the number of characters in the Roman numeral.
 */

public class RomanToInteger {
    public static void main(String[] args) {
        romanNumeralConversion("MCMVII");
    }

    public static int romanNumeralConversion(String romanNumeral) {
        System.out.println("Original Roman Numeral: " + romanNumeral);

        int number = 0;

        while (romanNumeral != null && !romanNumeral.isEmpty()) {
            String currentChar = romanNumeral.substring(0, 1);
            String nextChar = "";

            if (romanNumeral.length() > 1) {
                nextChar = romanNumeral.substring(1, 2);
            }

            switch (currentChar) {
                case "I":
                    if (nextChar.equals("V") || nextChar.equals("X")) {
                        number -= 1;
                    } else {
                        number += 1;
                    }
                    break;

                case "V":
                    number += 5;
                    break;

                case "X":
                    if (nextChar.equals("L") || nextChar.equals("C")) {
                        number -= 10;
                    } else {
                        number += 10;
                    }
                    break;

                case "L":
                    number += 50;
                    break;

                case "C":
                    if (nextChar.equals("D") || nextChar.equals("M")) {
                        number -= 100;
                    } else {
                        number += 100;
                    }
                    break;

                case "D":
                    number += 500;
                    break;

                case "M":
                    number += 1000;
                    break;

                default:
                    System.out.println("Invalid character: " + currentChar);
                    return number;
            }

            // DEBUG: used to trace the conversion process step by step
            // System.out.println("Current: " + number);

            // Remove the character that was just processed.
            romanNumeral = romanNumeral.substring(1);
        }

        System.out.println("Number conversion: " + number);
        System.out.println();
        return number;
    }
}
