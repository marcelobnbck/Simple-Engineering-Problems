package org.example.problems.DPK08;

import java.util.ArrayList;
import java.util.List;

public class DPK08_impl_04 {
    public static List<Integer> forEachMultiplier(int[] input, int number) {
        List<Integer> result = new ArrayList<>();
        for (int i : input) {
            result.add(i * number);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        List<Integer> result = forEachMultiplier(array, 2);
        System.out.println(result);
    }
}
