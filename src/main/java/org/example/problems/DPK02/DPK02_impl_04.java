package org.example.problems.DPK02;

import java.util.ArrayList;

public class DPK02_impl_04 {
    public static ArrayList<Integer> reverse(int[] input) {
        ArrayList<Integer> newArray = new ArrayList<>();
        for (int i = input.length-1; i >= 0; i --) {
            newArray.add(input[i]);
        }
        return newArray;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        ArrayList<Integer> result = reverse(array);
        System.out.println(result);
    }
}
