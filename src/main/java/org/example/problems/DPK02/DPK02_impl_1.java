package org.example.problems.DPK02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DPK02_impl_1 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        revert(numbers);
        System.out.println(numbers);
    }

    public static <T> void revert(List<T> list) {
        Collections.reverse(list);
    }
}
