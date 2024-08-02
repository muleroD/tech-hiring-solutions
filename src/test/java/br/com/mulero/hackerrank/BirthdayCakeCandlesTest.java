package br.com.mulero.hackerrank;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static br.com.mulero.hackerrank.BirthdayCakeCandles.birthdayCakeCandles;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class BirthdayCakeCandlesTest {

    @Test
    void givenCandlesWithOneMaxValues_thenReturn1() {
        List<Integer> candles = Arrays.asList(4, 1, 2, 3);
        assertEquals(1, birthdayCakeCandles(candles));
    }

    @Test
    void givenCandlesWithTwoMaxValues_thenReturn2() {
        List<Integer> candles = Arrays.asList(3, 2, 1, 3);
        assertEquals(2, birthdayCakeCandles(candles));
    }

    @Test
    void givenCandlesWithThreeMaxValues_thenReturn3() {
        List<Integer> candles = Arrays.asList(4, 1, 4, 4);
        assertEquals(3, birthdayCakeCandles(candles));
    }

    @Test
    void givenCandlesWithOneMaxValuesAndRemainingNegative_thenReturn1() {
        List<Integer> candles = Arrays.asList(4, -1, -2, -3, -4, 0);
        assertEquals(1, birthdayCakeCandles(candles));
    }

    @Test
    void givenCandlesWithEmptyList_thenThrowNullPointerException() {
        List<Integer> candles = Collections.emptyList();
        assertThrows(NullPointerException.class, () -> birthdayCakeCandles(candles));
    }
}