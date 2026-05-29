package org.example.problems.DPK12;

import java.util.Arrays;

public class DPK12_impl_09 {
    public static int[] bubbleSortWhile(int[] input) {
        int[] sorted = new int[input.length];
        int i = 0;
        while (i < input.length) {
            sorted[i] = input[i];
            i++;
        }
        i = 0;
        while (i < sorted.length - 1) {
            int j = 0;
            while (j < sorted.length - 1 - i) {
                if (sorted[j] > sorted[j + 1]) {
                    int temp = sorted[j];
                    sorted[j] = sorted[j + 1];
                    sorted[j + 1] = temp;
                }
                j++;
            }
            i++;
        }
        return sorted;
    }

    public static void main(String[] args) {
        int[] array = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(bubbleSortWhile(array)));
    }
}
