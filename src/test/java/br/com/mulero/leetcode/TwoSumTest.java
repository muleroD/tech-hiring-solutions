package br.com.mulero.leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static br.com.mulero.leetcode.TwoSum.twoSum;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TwoSumTest {

    @Test
    void givenListWithTwoValues_thenReturn0_1() {
        //Given
        int target = 9;
        List<Integer> nums = Arrays.asList(3, 3);
        List<Integer> expected = Arrays.asList(0, 1);

        //When
        List<Integer> result = twoSum(nums, target);

        //Then
        assertArrayEquals(expected.toArray(), result.toArray());
    }

    @Test
    void givenListWithThreeValues_thenReturn0_1() {
        //Given
        int target = 6;
        List<Integer> nums = Arrays.asList(3, 2, 4);
        List<Integer> expected = Arrays.asList(1, 2);

        //When
        List<Integer> result = twoSum(nums, target);

        //Then
        assertArrayEquals(expected.toArray(), result.toArray());
    }

    @Test
    void givenListWithFourValues_thenReturn0_1() {
        //Given
        int target = 9;
        List<Integer> nums = Arrays.asList(2, 7, 11, 15);
        List<Integer> expected = Arrays.asList(0, 1);

        //When
        List<Integer> result = twoSum(nums, target);

        //Then
        assertArrayEquals(expected.toArray(), result.toArray());
    }

}