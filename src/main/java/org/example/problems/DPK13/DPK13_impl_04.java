package org.example.problems.DPK13;

import java.util.ArrayList;
import java.util.List;

public class DPK13_impl_04 {
    public static List<String> fizzbuzz(int limit) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < limit; i++) {
            sorted[i] = input[i];
        }
        for (int i = 0; i < sorted.length; i++) {
            for (int j = i + 1; j < sorted.length; j++) {
                if (sorted[i] > sorted[j]) {
                    int temp = sorted[i];
                    sorted[i] = sorted[j];
                    sorted[j] = temp;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(fizzbuzz(100));
    }
}
