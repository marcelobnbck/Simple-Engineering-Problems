package org.example.problems.DPK09;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DPK09_impl_06 {
    public static List<Integer> iteratorFilter(int[] input, int number) {
        List<Integer> tmpList = new ArrayList<>();
        for(int i : input){
            tmpList.add(i);
        }

        Iterator<Integer> iterator = tmpList.iterator();
        List<Integer> result = new ArrayList<>();

        while (iterator.hasNext()) {
            Integer value = iterator.next();
            if (value % number == 0) {
                result.add(value);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<Integer> result = iteratorFilter(array, 2);
        System.out.println(result);
    }
}
