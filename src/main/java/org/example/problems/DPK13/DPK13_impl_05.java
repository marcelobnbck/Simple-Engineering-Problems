package org.example.problems.DPK13;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DPK13_impl_05 {
    public static List<String> fizzbuzzStream(int limit) {
        return IntStream.rangeClosed(1, limit)
                .mapToObj(i -> {
                    if (i % 15 == 0) return "FizzBuzz";
                    if (i % 3 == 0) return "Fizz";
                    if (i % 5 == 0) return "Buzz";
                    return String.valueOf(i);
                })
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println(fizzbuzzStream(100));
    }
}
