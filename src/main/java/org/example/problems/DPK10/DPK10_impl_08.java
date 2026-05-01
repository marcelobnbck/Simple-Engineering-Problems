package org.example.problems.DPK10;

public class DPK10_impl_08 {
    public static Integer reduceDoWhile2nd(int[] input) {
        int acc = 0;
        int i = 0;
        do {
            acc += input[i];
        } while (++i < input.length);
        return acc;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        Integer result = reduceDoWhile2nd(array);
        System.out.println(result);
    }
}
