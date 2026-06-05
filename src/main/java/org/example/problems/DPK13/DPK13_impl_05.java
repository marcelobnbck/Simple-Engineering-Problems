package org.example.problems.DPK13;

import java.util.ArrayList;
import java.util.List;

public class DPK13_impl_05 {
    public static List<String> fizzbuzzWhileSimple(int limit) {
        List<String> result = new ArrayList<>();
        int i = 1;
        while (i <= limit) {
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
            i++;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(fizzbuzzWhileSimple(100));
    }
}
