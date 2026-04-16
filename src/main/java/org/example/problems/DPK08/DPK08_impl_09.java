package org.example.problems.DPK08;

import java.util.ArrayList;
import java.util.List;

public class DPK08_impl_09 {
    public static List<Integer> doWhile2ndMultiplier(int[] input, int number) {
        List<Integer> result = new ArrayList<>();
        int i = 0;
        do {
            result.add(input[i] * number);
            i++;
        }
        while (i < input.length);
        return result;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        List<Integer> result = doWhile2ndMultiplier(array, 2);
        System.out.println(result);
    }
}
