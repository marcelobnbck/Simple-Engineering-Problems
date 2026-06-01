package org.example.problems.DPK13;

import java.util.ArrayList;
import java.util.List;

public class DPK13_impl_02 {
    public static List<String> fizzbuzz(int limit) {
        List<String> result = new ArrayList<>();
        int i = 1;
        while (i <= limit) {
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
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(fizzbuzz(100));
    }
}
