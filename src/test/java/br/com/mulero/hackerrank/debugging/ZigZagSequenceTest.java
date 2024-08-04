package br.com.mulero.hackerrank.debugging;

import org.junit.jupiter.api.Test;

import static br.com.mulero.hackerrank.debugging.ZigZagSequence.findZigZagSequence;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class ZigZagSequenceTest {

    @Test
    void givenSequenceLength5_thenReturnZigZagSequence() {
        // Given
        int[] a = {2, 3, 5, 1, 4};
        int n = a.length;
        int[] expected = {1, 4, 5, 3, 2};

        // When & Then
        assertDoesNotThrow(() -> findZigZagSequence(a, n));
    }

    @Test
    void givenSequenceLength7_thenReturnZigZagSequence() {
        // Given
        int[] a = {1, 2, 3, 4, 5, 6, 7};
        int n = a.length;
        int[] expected = {1, 2, 3, 7, 6, 5, 4};

        // When & Then
        assertDoesNotThrow(() -> findZigZagSequence(a, n));
    }

}