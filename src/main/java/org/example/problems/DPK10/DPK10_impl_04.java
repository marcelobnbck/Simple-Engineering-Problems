package org.example.problems.DPK10;

public class DPK10_impl_04 {
    public static Integer reduceForEach(int[] input) {
        int acc = 0;
        for(int i : input){
            acc += input[i-1];
        }
        return acc;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        Integer result = reduceForEach(array);
        System.out.println(result);
    }
}
