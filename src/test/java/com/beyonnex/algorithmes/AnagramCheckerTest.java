package com.beyonnex.algorithmes;

import org.junit.Assert;
import org.junit.Test;

public class AnagramCheckerTest {

    @Test
    public void testAnagramsWithSameWords() {
        // Given
        String firstWord = "listen";
        String secondWord = "listen";

        // When
        boolean result = AnagramChecker.areAnagrams(firstWord, secondWord);

        // Then
        Assert.assertTrue(result);
    }

    @Test
    public void testAnagramsWithSameLettersDifferentCase() {
        // Given
        String firstWord = "Listen";
        String secondWord = "silent";

        // When
        boolean result = AnagramChecker.areAnagrams(firstWord, secondWord);

        // Then
        Assert.assertTrue(result);
    }

    @Test
    public void testAnagrams_DifferentLength() {
        // Given
        String firstWord = "triangle";
        String secondWord = "integrala";

        // When
        boolean result = AnagramChecker.areAnagrams(firstWord, secondWord);

        // Then
        Assert.assertFalse(result);
    }


    @Test
    public void testAnagrams_EmptyWords() {
        // Given
        String firstWord = "";
        String secondWord = "";

        // When
        boolean result = AnagramChecker.areAnagrams(firstWord, secondWord);

        // Then
        Assert.assertTrue(result);
    }

    @Test
    public void testAnagrams_SingleCharacterWords() {
        // Given
        String firstWord = "a";
        String secondWord = "A";

        // When
        boolean result = AnagramChecker.areAnagrams(firstWord, secondWord);

        // Then
        Assert.assertTrue(result);
    }

    @Test
    public void testAnagrams_SpacesIgnored() {
        // Given
        String firstWord = "conversation";
        String secondWord = "voices rant on";

        // When
        boolean result = AnagramChecker.areAnagrams(firstWord, secondWord);

        // Then
        Assert.assertTrue(result);
    }

    @Test
    public void testAnagrams_NotAnagrams() {
        // Given
        String firstWord = "cat";
        String secondWord = "dog";

        // When
        boolean result = AnagramChecker.areAnagrams(firstWord, secondWord);

        // Then
        Assert.assertFalse(result);
    }
}