package org.example.problems.DPK07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DPK07_impl_02 {
    public static <T> List<List<T>> groupBy3(List<T> list, int groupSize) {
        List<List<T>> result = new ArrayList<>();

        for (int i = 0; i < list.size(); i += groupSize) {
            int end = Math.min(i + groupSize, list.size());
            result.add(new ArrayList<>(list.subList(i, end)));
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);

        List<String> letters = new ArrayList<>();
        letters.add("a");
        letters.add("b");
        letters.add("c");
        letters.add("d");
        letters.add("e");
        letters.add("f");
        letters.add("g");
        letters.add("h");
        letters.add("i");
        letters.add("j");
        System.out.println(groupBy3(numbers, 3));
        System.out.println(groupBy3(letters, 3));
    }
}
