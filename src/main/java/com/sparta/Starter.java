package com.sparta;

import java.util.Arrays;

public class Starter {

    public static void main(String[] args) {
        int[] input = {1,9,8,7,6,5,4,3,2,3,4,5,6,7,89,13,23445,76,87,98,908};
        Arrays.stream(BubbleSort.bubbleSort(input)).forEach(a -> System.out.print(a + ", "));
    }
}
