package org.example.problems.DPK08;

import java.util.ArrayList;
import java.util.List;

public class DPK08_impl_10 {
    public static List<Integer> forEach2ndMultiplier(int[] array, int multiplier) {
        List<Integer> result = new ArrayList<>();
        for (int i : array) {
            result.add(i * multiplier);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        List<Integer> result = forEach2ndMultiplier(array, 2);
        System.out.println(result);
    }
}
