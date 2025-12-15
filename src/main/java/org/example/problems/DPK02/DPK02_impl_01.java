package org.example.problems.DPK02;

import java.util.ArrayList;

public class DPK02_impl_01 {
    public static ArrayList<Integer> invertedArray(int[] input) {
        ArrayList<Integer> invertedList = new ArrayList<>();
        for (int i = input.length - 1; i >= 0; i--) {
            invertedList.add(input[i]);
        }
        return invertedList;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        ArrayList<Integer> result = invertedArray(array);
        System.out.println(result);
    }
}
