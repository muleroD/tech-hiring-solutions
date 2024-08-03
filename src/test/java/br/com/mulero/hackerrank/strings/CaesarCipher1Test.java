package br.com.mulero.hackerrank.strings;

import org.junit.jupiter.api.Test;

import static br.com.mulero.hackerrank.strings.CaesarCipher1.caesarCipher;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CaesarCipher1Test {

    @Test
    void givenKey0_whenCaesarCipher_thenEquals() {
        // Given
        String s = "middle-Outz";
        int k = 0;

        // When
        String result = caesarCipher(s, k);

        // Then
        assertEquals(s, result);
    }

    @Test
    void givenKey2_whenCaesarCipher_thenEquals() {
        // Given
        String s = "middle-Outz";
        int k = 2;

        // When
        String result = caesarCipher(s, k);

        // Then
        assertEquals("okffng-Qwvb", result);
    }

    @Test
    void givenKey3_whenCaesarCipher_thenEquals() {
        // Given
        String s = "There's-a-starman-wainting-in-the-sky";
        int k = 3;

        // When
        String result = caesarCipher(s, k);

        // Then
        assertEquals("Wkhuh'v-d-vwdupdq-zdlqwlqj-lq-wkh-vnb", result);
    }

    @Test
    void givenKey5_whenCaesarCipher_thenEquals() {
        // Given
        String s = "Always-Look-on-the-Bright-Side-of-Life";
        int k = 5;

        // When
        String result = caesarCipher(s, k);

        // Then
        assertEquals("Fqbfdx-Qttp-ts-ymj-Gwnlmy-Xnij-tk-Qnkj", result);
    }

    @Test
    void givenKey98_whenCaesarCipher_thenEquals() {
        // Given
        String s = "159357lcfd";
        int k = 98;

        // When
        String result = caesarCipher(s, k);

        // Then
        assertEquals("159357fwzx", result);
    }
}