package br.com.mulero.hackerrank.sorting;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static br.com.mulero.hackerrank.sorting.BigSorting.bigSorting;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class BigSortingTest {

    @Test
    void givenArrayWithUnsortedStrings_thenReturnSortedStrings() {
        // Given
        List<String> unsorted = Arrays.asList("1", "200", "150", "3");
        List<String> expected = Arrays.asList("1", "3", "150", "200");

        // When
        List<String> result = bigSorting(unsorted);

        // Then
        assertArrayEquals(expected.toArray(), result.toArray());
    }

    @Test
    void givenArrayWithUnsortedStrings_thenReturnSortedStrings2() {
        // Given
        List<String> unsorted = Arrays.asList("1", "2", "100", "12303479849857341718340192371", "3084193741082937", "3084193741082938", "111", "200");
        List<String> expected = Arrays.asList("1", "2", "100", "111", "200", "3084193741082937", "3084193741082938", "12303479849857341718340192371");

        // When
        List<String> result = bigSorting(unsorted);

        // Then
        assertArrayEquals(expected.toArray(), result.toArray());
    }

    @Test
    void givenArrayWithUnsortedStringsFromFile_thenReturnSortedStrings() throws IOException {
        // Given
        List<String> unsorted = Files.lines(Paths.get("src/test/resources/big_sorting_input.txt")).collect(Collectors.toList());
        List<String> expected = Files.lines(Paths.get("src/test/resources/big_sorting_expected.txt")).collect(Collectors.toList());

        // When
        List<String> result = bigSorting(unsorted);

        // Then
        assertArrayEquals(expected.toArray(), result.toArray());
    }

}