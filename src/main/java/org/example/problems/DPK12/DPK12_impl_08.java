package org.example.problems.DPK12;

import java.util.Arrays;

public class DPK12_impl_08 {
    public static int[] bubbleSortFor(int[] input) {
        int[] sorted = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            sorted[i] = input[i];
        }

        for (int i = 0; i < sorted.length; i++) {
            for (int j = i + 1; j < sorted.length; j++) {
                if (sorted[i] > sorted[j]) {
                    int temp = sorted[i];
                    sorted[i] = sorted[j];
                    sorted[j] = temp;
                }
            }
        }

        return sorted;
    }

    public static void main(String[] args) {
        int[] array = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(bubbleSortFor(array)));
    }
}
