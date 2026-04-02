package org.example.problems.DPK07;

import java.util.ArrayList;
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
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }

        List<String> letters = new ArrayList<>();
        for (char c = 'a'; c <= 'j'; c++) {
            letters.add(String.valueOf(c));
        }
        System.out.println(groupBy3(numbers, 3));
        System.out.println(groupBy3(letters, 3));
    }
}
