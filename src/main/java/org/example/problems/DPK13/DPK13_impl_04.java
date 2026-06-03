package org.example.problems.DPK13;

import java.util.ArrayList;
import java.util.List;

public class DPK13_impl_04 {
    public static List<String> fizzbuzzForSimple(int limit) {
        List<String> result = new ArrayList<>();
        for (int i = 1; i <= limit; i++) {
            String value = "";
            if (i % 3 == 0) {
                value += "Fizz";
            }
            if (i % 5 == 0) {
                value += "Buzz";
            }
            if (value.isEmpty()) {
                value = String.valueOf(i);
            }
            result.add(value);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(fizzbuzzForSimple(100));
    }
}
