package org.example.problems.DPK09;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DPK09_impl_05 {
    public static List<Integer> streamFilter(int[] input, int number) {
        return Arrays.stream(input)
                .map(n -> n % number == 0 ? n : 0)
                .filter(n -> n != 0)
                .boxed()
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<Integer> result = streamFilter(array, 2);
        System.out.println(result);
    }
}
