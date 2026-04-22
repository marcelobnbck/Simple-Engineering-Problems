package org.example.problems.DPK09;

import java.util.ArrayList;
import java.util.List;

public class DPK09_impl_09 {
    public static List<Integer> filter9(int[] input, int number) {
        List<Integer> result = new ArrayList<>();
        int i = 0;
        do {
            if (input[i] % number == 0) {
                result.add(input[i]);
            }
            i++;
        }
        while (i < input.length);
        return  result;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<Integer> result = filter9(array, 2);
        System.out.println(result);
    }
}
