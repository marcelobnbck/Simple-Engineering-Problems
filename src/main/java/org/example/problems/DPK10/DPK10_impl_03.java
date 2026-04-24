package org.example.problems.DPK10;

public class DPK10_impl_03 {
    public static Integer reduce(int[] input) {
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
        Integer result = reduce(array);
        System.out.println(result);
    }
}
