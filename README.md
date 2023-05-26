# Anagram Checker

This project provides a Java program for checking if two words are anagrams of each other. An anagram is a word or phrase formed by rearranging the letters of another word or phrase. For example, "listen" and "silent" are anagrams.

## How it Works

The program takes two words as input from the user and determines if they are anagrams. The comparison is case-insensitive, and any spaces in the input words are ignored during the check.

The solution utilizes a character counting approach, where the program counts the frequency of each character in both words. If the counts for all characters are the same in both words, then they are anagrams.

The program uses a `HashMap<Character, Integer>` to keep track of the character counts. It iterates over each character in both words, increments the count for characters in the first word, and decrements the count for characters in the second word. Finally, it checks if all character counts are zero to determine if the words are anagrams.

## Why This Solution is Effective

- **Efficient Time Complexity**: The solution has a time complexity of O(n), where n is the length of the longer word. It achieves this efficiency by iterating over each character of the input words only once to update the character counts.

- **Declarative Approach**: The solution utilizes the `Stream` API in Java to provide a more concise and declarative implementation. It makes use of lambda expressions and functional programming concepts to handle the character counting process.

- **Flexibility**: The program is designed to be easily extensible. It can be integrated into other Java applications or used as a standalone utility for anagram checking.

- **User-Friendly**: The program interacts with the user through the console, providing clear prompts for input and displaying the result of the anagram check. The user has the option to repeat the process multiple times or exit the program.

## Usage

To build and run the program, follow these steps:

1. Make sure you have Maven and Java 8 or later installed on your system.

2. Clone this repository or download the source code.

3. Open a terminal or command prompt, navigate to the project's root directory.

4. Run the following command to build the project:

mvn clean install

This will compile the Java source code and create the necessary build artifacts.

5. Once the build is successful, you can run the program using the following command:

java -cp target/anagram-checker-1.0.0.jar AnagramChecker