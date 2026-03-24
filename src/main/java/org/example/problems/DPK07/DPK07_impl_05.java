package org.example.problems.DPK07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DPK07_impl_05 {
    public static <T> List<List<T>> groupBy(List<T> list, int size) {
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
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<String> letters = Arrays.asList("a","b","c","d","e","f","g","h","i","j");
        System.out.println(groupBy(numbers, 3));
        System.out.println(groupBy(letters, 3));
    }
}
