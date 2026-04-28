package org.example.problems.DPK10;

public class DPK10_impl_04 {
    public static Integer reduce(int[] input) {
        int acc = 0;
        int i = 0;
        do {
            acc += input[i];
            i++;
        }
        while (i < input.length);
        return acc;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        Integer result = reduce(array);
        System.out.println(result);
    }
}
