package org.example.problems.DPK07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DPK07_impl_03 {
    public static <T> List<List<T>> groupByStep(List<T> list, int size) {
        List<List<T>> result = new ArrayList<>();
        if (list == null || size <= 0)
            return result;

        for (int i = 0; i < list.size(); i += size) {
            List<T> group = new ArrayList<>();

            for (int j = i; j < i + size && j < list.size(); j++) {
                group.add(list.get(j));
            }
            result.add(group);
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<String> letters = Arrays.asList("a","b","c","d","e","f","g","h","i","j");

        System.out.println(groupByStep(numbers, 3));
        System.out.println(groupByStep(letters, 3));
    }
}
