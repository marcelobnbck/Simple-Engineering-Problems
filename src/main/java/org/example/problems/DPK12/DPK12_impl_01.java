package org.example.problems.DPK12;

import java.util.Arrays;

public class DPK12_impl_01 {
    public static int[] bubbleSort(int[] input) {
        int[] sorted = input.clone();
        for (int i = 0; i < sorted.length; i++) {
            for (int j = 0; j < sorted.length; j++) {
                // logic
            }
        }
        return sorted;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(bubbleSort(array)));
    }
}
