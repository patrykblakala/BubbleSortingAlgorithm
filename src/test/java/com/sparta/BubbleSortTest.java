package com.sparta;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class BubbleSortTest {

    @Test
    @DisplayName("Given an array of integers method should return an ascending sorted array")
    public void bubbleSortMethodTest_ShouldReturnSortedArray() {
        int[] input = {9,8,7,6,5,4,3,2,1,13,12,11,10};
        int[] expected = {1,2,3,4,5,6,7,8,9,10,11,12,13};
        int[] result = BubbleSort.bubbleSort(input);
        assertArrayEquals(expected, result);
    }

    @Test
    @DisplayName("Given an empty array of integers method should return an empty array")
    public void bubbleSortMethodTest_ShouldReturnEmptyArray() {
        int[] input = {};
        int[] expected = {};
        int[] result = BubbleSort.bubbleSort(input);
        assertArrayEquals(expected, result);
    }

    @Test
    @DisplayName("Given a one element array of integers method should return a one element array")
    public void bubbleSortMethodTest_ShouldReturnOneElementArray() {
        int[] input = {7};
        int[] expected = {7};
        int[] result = BubbleSort.bubbleSort(input);
        assertArrayEquals(expected, result);
    }

    @Test
    @DisplayName("Given an array of  negaative and positive integers method should return a sorted array")
    public void bubbleSortMethodTest_ShouldReturnSortedArrayWithNegativeValues() {
        int[] input = {-23, -45, 89, 100, -7, -13};
        int[] expected = {-45, -23, -13, -7, 89, 100};
        int[] result = BubbleSort.bubbleSort(input);
        assertArrayEquals(expected, result);
    }

    @Test
    @DisplayName("Given an array of  same integers method should return a sorted array")
    public void bubbleSortMethodTest_ShouldReturnSortedArrayWithSameValues() {
        int[] input = {8,8,8,8,8,8};
        int[] expected = {8,8,8,8,8,8};
        int[] result = BubbleSort.bubbleSort(input);
        assertArrayEquals(expected, result);
    }


}