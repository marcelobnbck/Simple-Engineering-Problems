package org.example.problems.DPK02;

import java.util.ArrayList;

public class DPK02_impl_10 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        ArrayList<Integer> newArray = new ArrayList<>();
        for (int i = array.length-1; i>=0; i--) {
            int result = array[i];
            newArray.add(result);
        }
        System.out.println(newArray);
    }
}

