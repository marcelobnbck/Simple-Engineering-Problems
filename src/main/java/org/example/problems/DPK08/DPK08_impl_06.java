package org.example.problems.DPK08;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DPK08_impl_06 {
    public static List<Integer> streamMultiplier(int[] input, int number) {
        return Arrays.stream(input)
                .map(n -> n * number)
                .boxed()
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        List<Integer> result = streamMultiplier(array, 2);
        System.out.println(result);
    }
}
