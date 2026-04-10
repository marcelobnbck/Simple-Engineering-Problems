package org.example.problems.DPK08;

import java.util.ArrayList;
import java.util.List;

public class DPK08_impl_03 {
    public static List<Integer> multiplier(int[] input, int number) {
        List<Integer> result = new ArrayList<>();
        int index = 0;
        do {
            result.add(input[index] * number);
            index++;
        }
        while (index < input.length);
        return  result;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        List<Integer> result = multiplier(array, 2);
        System.out.println(result);
    }
}
