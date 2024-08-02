package br.com.mulero.hackerrank;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CompareTripletsTest {

    @Test
    void givenTwoArrays_whenArrayAHasMorePoints_thenArrayAWins() {
        // Given
        List<Integer> a = Arrays.asList(5, 6, 7);
        List<Integer> b = Arrays.asList(3, 6, 10);

        // When
        List<Integer> result = CompareTriplets.compareTriplets(a, b);

        // Then
        assertEquals(1, result.get(0));
        assertEquals(1, result.get(1));
    }

    @Test
    void givenTwoArrays_whenArrayBHasMorePoints_thenArrayBWins() {
        // Given
        List<Integer> a = Arrays.asList(5, 6, 7);
        List<Integer> b = Arrays.asList(3, 8, 10);

        // When
        List<Integer> result = CompareTriplets.compareTriplets(a, b);

        // Then
        assertEquals(1, result.get(0));
        assertEquals(2, result.get(1));
    }

    @Test
    void givenTwoArrays_whenArraysHaveSamePoints_thenArraysDraw() {
        // Given
        List<Integer> a = Arrays.asList(5, 6, 7);
        List<Integer> b = Arrays.asList(3, 6, 10);

        // When
        List<Integer> result = CompareTriplets.compareTriplets(a, b);

        // Then
        assertEquals(1, result.get(0));
        assertEquals(1, result.get(1));
    }

}