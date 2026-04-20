package org.example.problems.DPK09;

import java.util.ArrayList;
import java.util.List;

public class DPK09_impl_03 {
    public static List<Integer> doWhileFilter(int[] input, int number) {
        List<Integer> result = new ArrayList<>();
        int index = 0;
        do {
            if (input[index] % number == 0) {
                result.add(input[index]);
            }
            index++;
        }
        while (index < input.length);
        return  result;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<Integer> result = doWhileFilter(array, 2);
        System.out.println(result);
    }
}
