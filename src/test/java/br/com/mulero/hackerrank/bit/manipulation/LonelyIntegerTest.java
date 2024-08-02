package br.com.mulero.hackerrank.bit.manipulation;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static br.com.mulero.hackerrank.bit.manipulation.LonelyInteger.lonelyinteger;
import static org.junit.jupiter.api.Assertions.assertEquals;

class LonelyIntegerTest {

    @Test
    void givenAnArrayWithOneElement_ThenReturnTheSameElement() {
        // Given
        List<Integer> arr = Collections.singletonList(1);

        // When
        int result = lonelyinteger(arr);

        // Then
        assertEquals(1, result);
    }

    @Test
    void givenAnArrayWithTwoElements_ThenReturnTheSecondElement() {
        // Given
        List<Integer> arr = Arrays.asList(1, 2);

        // When
        int result = lonelyinteger(arr);

        // Then
        assertEquals(2, result);
    }

    @Test
    void givenAnArrayWithThreeElements_ThenReturnTheFirstElement() {
        // Given
        List<Integer> arr = Arrays.asList(1, 2, 1);

        // When
        int result = lonelyinteger(arr);

        // Then
        assertEquals(2, result);
    }

    @Test
    void givenAnArrayWithFiveElements_ThenReturnTheThirdElement() {
        // Given
        List<Integer> arr = Arrays.asList(1, 2, 1, 2, 3);

        // When
        int result = lonelyinteger(arr);

        // Then
        assertEquals(3, result);
    }

}