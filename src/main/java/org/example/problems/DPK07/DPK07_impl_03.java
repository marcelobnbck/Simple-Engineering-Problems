package org.example.problems.DPK07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DPK07_impl_03 {
    public static <T> List<List<T>> groupBy3(List<T> list, int groupSize) {
        List<List<T>> result = new ArrayList<>();

        for (int i = 0; i < list.size(); i += groupSize) {
            List<T> group = new ArrayList<>();
            for (int j = i; j < i + groupSize && j < list.size(); j++) {
                group.add(list.get(j));
            }
            result.add(group);
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<String> letters = Arrays.asList("a","b","c","d","e","f","g","h","i","j");
        System.out.println(groupBy3(numbers, 3));
        System.out.println(groupBy3(letters, 3));
    }
}
