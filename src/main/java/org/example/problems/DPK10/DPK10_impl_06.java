package org.example.problems.DPK10;

import java.util.Arrays;

public class DPK10_impl_06 {
    public static Integer reduceStream2(int[] input) {
        return Arrays.stream(input)
                .reduce(0, (acc, x) -> acc + x);
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        Integer result = reduceStream2(array);
        System.out.println(result);
    }
}
