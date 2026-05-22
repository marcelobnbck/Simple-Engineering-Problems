package org.example.problems.DPK12;

import java.util.Arrays;

public class DPK12_impl_02 {
    public static int[] bubbleSortSwapSimple(int[] input) {
        int[] result = input.clone();
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result.length - 1; j++) {
                if (result[j] > result[j + 1]) {
                    int temp = result[j];
                    result[j] = result[j + 1];
                    result[j + 1] = temp;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(bubbleSortSwapSimple(array)));
    }
}
