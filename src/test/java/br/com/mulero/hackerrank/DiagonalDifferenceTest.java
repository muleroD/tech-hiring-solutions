package br.com.mulero.hackerrank;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static br.com.mulero.hackerrank.DiagonalDifference.diagonalDifference;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DiagonalDifferenceTest {

    @Test
    void Given_Matrix_3x3_When_DiagonalDifference_Then_Return_4() {
        // Given
        List<List<Integer>> arr = Arrays.asList(
                Arrays.asList(11, 2, 4),
                Arrays.asList(4, 5, 6),
                Arrays.asList(10, 8, -12)
        );

        // When
        int result = diagonalDifference(arr);

        // Then
        assertEquals(15, result);
    }

    @Test
    void Given_Matrix_4x4_When_DiagonalDifference_Then_Return_15() {
        // Given
        List<List<Integer>> arr = Arrays.asList(
                Arrays.asList(1, 2, 3, 4),
                Arrays.asList(5, 6, 7, 8),
                Arrays.asList(9, 10, 11, 12),
                Arrays.asList(13, 14, 15, 16)
        );

        // When
        int result = diagonalDifference(arr);

        // Then
        assertEquals(0, result);
    }

    @Test
    void Given_Matrix_5x5_When_DiagonalDifference_Then_Return_15() {
        // Given
        List<List<Integer>> arr = Arrays.asList(
                Arrays.asList(1, 2, 3, 4, 5),
                Arrays.asList(6, 7, 8, 9, 10),
                Arrays.asList(11, 12, 13, 14, 15),
                Arrays.asList(16, 17, 18, 19, 20),
                Arrays.asList(21, 22, 23, 24, 25)
        );

        // When
        int result = diagonalDifference(arr);

        // Then
        assertEquals(0, result);
    }

}