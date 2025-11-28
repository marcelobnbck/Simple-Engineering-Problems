package org.example.problems.DPK02;

import java.util.ArrayList;

public class DPK02_impl_02 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        ArrayList<Integer> newArray = new ArrayList<>();
        int i = array.length;
        while (i > 0) {
            newArray.add(array[i-1]);
            i--;
        }
        System.out.println(newArray);
    }
}
