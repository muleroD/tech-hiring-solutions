package br.com.mulero.hackerrank;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static br.com.mulero.hackerrank.MiniMaxSum.miniMaxSum;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MiniMaxSumTest {

    @Test
    void givenArrayWithFiveElementsOdd_thenShouldReturn16And24() {
        // Given
        List<Integer> arr = Arrays.asList(1, 3, 5, 7, 9);

        // When
        List<Long> minMax = miniMaxSum(arr);

        // Then
        assertEquals(16, minMax.get(0));
        assertEquals(24, minMax.get(1));
    }

    @Test
    void givenArrayWithFiveElementsEven_thenShouldReturn10And14() {
        // Given
        List<Integer> arr = Arrays.asList(2, 4, 6, 8, 10);

        // When
        List<Long> minMax = miniMaxSum(arr);

        // Then
        assertEquals(20, minMax.get(0));
        assertEquals(28, minMax.get(1));
    }

    @Test
    void givenArrayWithFiveElements_thenShouldReturn10And14() {
        // Given
        List<Integer> arr = Arrays.asList(1, 2, 3, 4, 5);

        // When
        List<Long> minMax = miniMaxSum(arr);

        // Then
        assertEquals(10, minMax.get(0));
        assertEquals(14, minMax.get(1));
    }

}