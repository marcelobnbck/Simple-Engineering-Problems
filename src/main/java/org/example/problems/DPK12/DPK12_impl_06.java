package org.example.problems.DPK12;

import java.util.Arrays;

public class DPK12_impl_06 {
    public static int[] bubbleSortDoWhile(int[] input) {
        int[] sorted = new int[input.length];
        int i = 0;
        do {
            sorted[i] = input[i];
            i++;
        } while (i < input.length);
        i = 0;
        do {
            int j = 0;
            do {
                if (sorted[j] > sorted[j + 1]) {
                    int temp = sorted[j];
                    sorted[j] = sorted[j + 1];
                    sorted[j + 1] = temp;
                }
                j++;
            } while (j < sorted.length - 1 - i);
            i++;
        } while (i < sorted.length - 1);
        return sorted;
    }

    public static void main(String[] args) {
        int[] array = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(bubbleSortDoWhile(array)));
    }
}
