package org.example.problems.DPK10;

public class DPK10_impl_09 {
    public static Integer reduceWhile2nd(int[] input) {
        int acc = 0;
        int i = 0;
        while (i < input.length) {
            acc += input[i];
            i++;
        }
        return acc;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        Integer result = reduceWhile2nd(array);
        System.out.println(result);
    }
}
