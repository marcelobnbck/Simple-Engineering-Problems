package org.example.problems.DPK08;

import java.util.ArrayList;
import java.util.List;

public class DPK08_impl_08 {
    public static List<Integer> while2ndMultiplier(int[] input, int number) {
        List<Integer> result = new ArrayList<>();
        Integer i = 0;
        while (i < input.length) {
            result.add(input[i] * number);
            i++;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        List<Integer> result = while2ndMultiplier(array, 2);
        System.out.println(result);
    }
}
