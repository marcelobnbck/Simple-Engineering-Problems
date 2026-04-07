package org.example.problems.DPK08;

import java.util.ArrayList;
import java.util.List;

public class DPK08_impl_02 {
    public static List<Integer> multiplier(int[] input, int number) {
        List<Integer> indexResult = new ArrayList<>();
        int i = 4;
        while (i <= 4) {
            indexResult.add(input[i] * number);
            i++;
            //input[i] *= number;
        }
        return indexResult;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        List<Integer> result = multiplier(array, 2);
        System.out.println(result);
    }
}
