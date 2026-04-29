package org.example.problems.DPK10;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DPK10_impl_05 {
    public static Integer reduceStream(int[] input) {
        //int acc = 0;
        return Arrays.stream(input)
                .map(n -> acc += input[n-1])
                //.filter(n -> n != 0)
                .boxed()
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        Integer result = reduceStream(array);
        System.out.println(result);
    }
}
