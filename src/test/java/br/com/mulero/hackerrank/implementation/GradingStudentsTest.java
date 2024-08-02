package br.com.mulero.hackerrank.implementation;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static br.com.mulero.hackerrank.Implementation.GradingStudents.gradingStudents;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class GradingStudentsTest {

    @Test
    void givenSimpleTestFromHackerRank_thenRound() {
        // Given
        List<Integer> grades = Arrays.asList(73, 67, 38, 33);
        List<Integer> expected = Arrays.asList(75, 67, 40, 33);

        // When
        List<Integer> result = gradingStudents(grades);

        // Then
        assertArrayEquals(expected.toArray(), result.toArray());
    }

    @Test
    void givenOnlyMultiplesofFiveLessThan38_thenDoNotRound() {
        // Given
        List<Integer> grades = Arrays.asList(5, 10, 15, 20, 25, 30, 35);
        List<Integer> expected = Arrays.asList(5, 10, 15, 20, 25, 30, 35);

        // When
        List<Integer> result = gradingStudents(grades);

        // Then
        assertArrayEquals(expected.toArray(), result.toArray());
    }

    @Test
    void givenGradesLessThan38_thenDoNotRound() {
        // Given
        List<Integer> grades = Arrays.asList(33, 36, 37);
        List<Integer> expected = Arrays.asList(33, 36, 37);

        // When
        List<Integer> result = gradingStudents(grades);

        // Then
        assertArrayEquals(expected.toArray(), result.toArray());
    }

    @Test
    void givenGradesGreaterThan38_thenRound() {
        // Given
        List<Integer> grades = Arrays.asList(38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49);
        List<Integer> expected = Arrays.asList(40, 40, 40, 41, 42, 45, 45, 45, 46, 47, 50, 50);

        // When
        List<Integer> result = gradingStudents(grades);

        // Then
        assertArrayEquals(expected.toArray(), result.toArray());
    }

    @Test
    void givenGradesGreaterThan38_thenRound2() {
        // Given
        List<Integer> grades = Arrays.asList(73, 67, 38, 33, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49);
        List<Integer> expected = Arrays.asList(75, 67, 40, 33, 40, 40, 41, 42, 45, 45, 45, 46, 47, 50, 50);

        // When
        List<Integer> result = gradingStudents(grades);

        // Then
        assertArrayEquals(expected.toArray(), result.toArray());
    }

}