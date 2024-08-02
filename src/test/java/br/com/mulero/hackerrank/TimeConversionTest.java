package br.com.mulero.hackerrank;

import org.junit.jupiter.api.Test;

import static br.com.mulero.hackerrank.TimeConversion.timeConversion;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TimeConversionTest {

    @Test
    void givenMidnight_thenReturn00() {
        // Given
        String s = "12:00:00AM";

        // When
        String result = timeConversion(s);

        // Then
        assertEquals("00:00:00", result);
    }

    @Test
    void givenMidday_thenReturn12() {
        // Given
        String s = "12:00:00PM";

        // When
        String result = timeConversion(s);

        // Then
        assertEquals("12:00:00", result);
    }

    @Test
    void givenEightAndHalfPM_thenReturn20AndHalf() {
        // Given
        String s = "08:30:00PM";

        // When
        String result = timeConversion(s);

        // Then
        assertEquals("20:30:00", result);
    }

    @Test
    void givenFourAndTwentyTwoAM_thenReturn04AndTwentyTwo() {
        // Given
        String s = "04:22:00AM";

        // When
        String result = timeConversion(s);

        // Then
        assertEquals("04:22:00", result);
    }

    @Test
    void givenNineAndEightTwentyOnePM_thenReturnTwentyOneAndEightTwentyOne() {
        // Given
        String s = "09:08:21PM";

        // When
        String result = timeConversion(s);

        // Then
        assertEquals("21:08:21", result);
    }
}