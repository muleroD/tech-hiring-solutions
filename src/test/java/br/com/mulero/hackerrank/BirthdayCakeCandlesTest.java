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
    void shouldReturn1() {
        List<Integer> candles = Arrays.asList(4, 1, 2, 3);
        assertEquals(1, birthdayCakeCandles(candles));
    }

    @Test
    void shouldReturn2() {
        List<Integer> candles = Arrays.asList(3, 2, 1, 3);
        assertEquals(2, birthdayCakeCandles(candles));
    }

    @Test
    void shouldReturn3() {
        List<Integer> candles = Arrays.asList(4, 1, 4, 4);
        assertEquals(3, birthdayCakeCandles(candles));
    }

    @Test
    void shouldReturn4() {
        List<Integer> candles = Arrays.asList(5, 1, 2, 4, 2, 3, 1, 3, 4, 2, 1, 0, 5, 5, 5);
        assertEquals(4, birthdayCakeCandles(candles));
    }

    @Test
    void shouldReturn0() {
        List<Integer> candles = Collections.emptyList();
        assertThrows(NullPointerException.class, () -> birthdayCakeCandles(candles));
    }
}