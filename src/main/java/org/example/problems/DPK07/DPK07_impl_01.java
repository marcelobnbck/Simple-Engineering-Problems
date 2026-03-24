package org.example.problems.DPK07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DPK07_impl_01 {
    public static <T> List<List<T>> groupBy(List<T> list, int groupSize) {
        List<List<T>> result = new ArrayList<>();

        for (int i = 0; i < list.size(); i += groupSize) {
            int end = Math.min(i + groupSize, list.size());
            result.add(new ArrayList<>(list.subList(i, end)));
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<String> letters = Arrays.asList("a","b","c","d","e","f","g","h","i","j");
        System.out.println(groupBy(numbers, 3));
        System.out.println(groupBy(letters, 3));
    }
}
