package org.example.problems.DPK09;

import java.util.ArrayList;
import java.util.List;

public class DPK09_impl_10 {
    public static List<Integer> filter10(int[] input, int number) {
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < input.length; i++){
            if(input[i] % number == 0){
                result.add(input[i]);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<Integer> result = filter10(array, 2);
        System.out.println(result);
    }
}
