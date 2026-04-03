package org.example.problems.DPK07;

import java.util.ArrayList;
import java.util.List;

public class DPK07_impl_05 {
    public static <T> List<List<T>> groupBy3(List<T> list, int size) {
        List<List<T>> result = new ArrayList<>();
        List<T> group = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            group.add(list.get(i));
            if (group.size() == size) {
                result.add(group);
                group = new ArrayList<>();
            }
        }
        if (group.size() > 0) {
            result.add(group);
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
