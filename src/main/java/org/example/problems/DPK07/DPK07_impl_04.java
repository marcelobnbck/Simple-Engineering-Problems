package org.example.problems.DPK07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DPK07_impl_04 {
    public static <T> List<List<T>> groupByWhile(List<T> list, int size) {
        List<List<T>> result = new ArrayList<>();
        int index = 0;

        while (index < list.size()) {
            List<T> group = new ArrayList<>();
            int count = 0;

            while (count < size && index < list.size()) {
                group.add(list.get(index));
                index++;
                count++;
            }
            result.add(group);
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<String> letters = Arrays.asList("a","b","c","d","e","f","g","h","i","j");
        System.out.println(groupByWhile(numbers, 3));
        System.out.println(groupByWhile(letters, 3));
    }
}
