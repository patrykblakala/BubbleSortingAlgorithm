package com.sparta;

public class BubbleSort {

    public static int[] bubbleSort(int[] input) {
        if (input.length <=1) {
            return input;
        }
        for (int i = 0; i < input.length - 1; i++) {
            for (int j = 0; j < input.length - 1; j++) {
                if (input[j] > input[j + 1]) {
                    int temporary = input[j];
                    input[j] = input[j + 1];
                    input[j + 1] = temporary;
                }
            }
        }
        return input;
    }
}
