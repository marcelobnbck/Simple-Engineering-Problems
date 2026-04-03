package org.example.problems.DPK07;

import java.util.ArrayList;
import java.util.List;

public class DPK08_impl_08 {
    public static <T> List<List<T>> groupBy3(List<T> list, int groupSize) {
        List<List<T>> result = new ArrayList<>();

        for (int i = 0; i < list.size(); i += groupSize) {
            List<T> group3 = new ArrayList<>();

            for (int j = i; j < i + groupSize && j < list.size(); j++) {
                group3.add(list.get(j));
            }
            result.add(group3);
        }

        return result;
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }
        System.out.println(groupBy3(numbers, 3));

        List<String> letters = new ArrayList<>();
        for (char c = 'a'; c <= 'j'; c++) {
            letters.add(String.valueOf(c));
        }
        System.out.println(groupBy3(letters, 3));
    }
}
