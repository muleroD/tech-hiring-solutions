package br.com.mulero.hackerrank.warmup;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static br.com.mulero.hackerrank.warmup.BirthdayCakeCandles.birthdayCakeCandles;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class BirthdayCakeCandlesTest {

    @Test
    void givenCandlesWithOneMaxValues_thenReturn1() {
        //Given
        List<Integer> candles = Arrays.asList(4, 1, 2, 3);

        //When
        int result = birthdayCakeCandles(candles);

        //Then
        assertEquals(1, result);
    }

    @Test
    void givenCandlesWithTwoMaxValues_thenReturn2() {
        //Given
        List<Integer> candles = Arrays.asList(3, 2, 1, 3);

        //When
        int result = birthdayCakeCandles(candles);

        //Then
        assertEquals(2, result);
    }

    @Test
    void givenCandlesWithThreeMaxValues_thenReturn3() {
        //Given
        List<Integer> candles = Arrays.asList(4, 1, 4, 4);

        //When
        int result = birthdayCakeCandles(candles);

        //Then
        assertEquals(3, result);
    }

    @Test
    void givenCandlesWithOneMaxValuesAndRemainingNegative_thenReturn1() {
        //Given
        List<Integer> candles = Arrays.asList(4, -1, -2, -3, -4, 0);

        //When
        int result = birthdayCakeCandles(candles);

        //Then
        assertEquals(1, result);
    }

    @Test
    void givenCandlesWithEmptyList_thenThrowNullPointerException() {
        //Given
        List<Integer> candles = Collections.emptyList();

        //When and Then
        assertThrows(NullPointerException.class, () -> birthdayCakeCandles(candles));
    }
}