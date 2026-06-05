package org.example.problems.DPK13;

import java.util.ArrayList;
import java.util.List;

public class DPK13_impl_08 {
    public static List<String> fizzbuzzDoWhile2(int limit) {
        List<String> result = new ArrayList<>();
        int i = 1;
        do {
            if (i % 3 == 0 && i % 5 == 0) {
                result.add("FizzBuzz");
            } else if (i % 3 == 0) {
                result.add("Fizz");
            } else if (i % 5 == 0) {
                result.add("Buzz");
            } else {
                result.add(String.valueOf(i));
            }
            i++;
        } while (i <= limit);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(fizzbuzzDoWhile2(100));
    }
}
