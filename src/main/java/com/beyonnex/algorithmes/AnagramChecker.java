package com.beyonnex.algorithmes;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AnagramChecker {

    /**
     * Checks if two words are anagrams of each other.
     *
     * @param firstWord  the first word to compare
     * @param secondWord the second word to compare
     * @return true if the words are anagrams, false otherwise
     */
    public static boolean areAnagrams(String firstWord, String secondWord) {
        String processedFirstWord = removeSpacesAndConvertToLowercase(firstWord);
        String processedSecondWord = removeSpacesAndConvertToLowercase(secondWord);

        if (processedFirstWord.length() != processedSecondWord.length()) {
            return false;
        }

        Map<Character, Integer> characterCounts = new HashMap<>();

        // Update character counts for processedFirstWord
        processedFirstWord.chars()
                .forEach(c -> characterCounts.put((char) c, characterCounts.getOrDefault((char) c, 0) + 1));

        // Update character counts for processedSecondWord
        processedSecondWord.chars()
                .forEach(c -> characterCounts.put((char) c, characterCounts.getOrDefault((char) c, 0) - 1));

        // Check if all character counts are zero
        return characterCounts.values().stream().allMatch(count -> count == 0);
    }

    /**
     * Removes spaces and converts the input text to lowercase.
     *
     * @param text the input text to process
     * @return the processed text with spaces removed and converted to lowercase
     */
    private static String removeSpacesAndConvertToLowercase(String text) {
        return text.toLowerCase().replaceAll("\\s", "");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String exitKeyword = "exit";

        boolean shouldExit = false;

        while (!shouldExit) {
            System.out.print("Enter the first word (or 'exit' to quit): ");
            String firstWord = scanner.nextLine();

            if (firstWord.equalsIgnoreCase(exitKeyword)) {
                shouldExit = true;
                break;
            }

            System.out.print("Enter the second word: ");
            String secondWord = scanner.nextLine();

            if (areAnagrams(firstWord, secondWord)) {
                System.out.println("The words are anagrams.");
            } else {
                System.out.println("The words are not anagrams.");
            }
        }

        scanner.close();
    }
}