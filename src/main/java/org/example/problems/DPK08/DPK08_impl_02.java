package org.example.problems.DPK08;

import java.util.ArrayList;
import java.util.List;

public class DPK08_impl_02 {
    public static List<Integer> multiplier(int[] input, int number) {
        List<Integer> indexResult = new ArrayList<>();
        int index = 0;
        while (index < input.length) {
            indexResult.add(input[index++]);
        }
        for (int i = 0; i < indexResult.size(); i++) {
            indexResult.set(i, indexResult.get(i) * number);
        }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        List<Integer> result = multiplier(array, 2);
        System.out.println(result);
    }
}
