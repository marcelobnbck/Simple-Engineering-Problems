package org.example.problems.DPK08;

import java.util.ArrayList;
import java.util.List;

public class DPK08_impl_07 {
    public static List<Integer> for2ndMultiplier(int[] input, int number) {
        List<Integer> result = new ArrayList<>();
        Integer i = 0;
        for (i = 0; i < input.length; i++) {
            result.add(input[i] * number);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        List<Integer> result = for2ndMultiplier(array, 2);
        System.out.println(result);
    }
}
