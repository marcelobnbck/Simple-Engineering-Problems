package org.example.problems.DPK02;

import java.util.ArrayList;

public class DPK02_impl_08 {
    public static ArrayList<Integer> reverseArray(int[] input) {
        ArrayList<Integer> newArray = new ArrayList<>();
        int i = input.length;
        while (i > 0) {
            newArray.add(input[i-1]);
            i--;
        }
        return newArray;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        ArrayList<Integer> result = reverseArray(array);
        System.out.println(result);
    }
}
