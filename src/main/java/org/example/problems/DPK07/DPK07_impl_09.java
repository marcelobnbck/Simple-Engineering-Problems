package org.example.problems.DPK07;

import java.util.ArrayList;
import java.util.List;

public class DPK07_impl_09 {
    public static <T> List<List<T>> groupBy3(List<T> list, int size) {
        List<List<T>> result = new ArrayList<>();
        int index = 0;

        while (index < list.size()) {
            List<T> group3 = new ArrayList<>();
            int count = 0;

            while (count < size && index < list.size()) {
                group3.add(list.get(index));
                index++;
                count++;
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
