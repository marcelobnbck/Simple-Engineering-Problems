package org.example.problems.DPK08;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DPK08_impl_05 {
    public static List<Integer> iteratorMultiplier(int[] input, int number) {
        List<Integer> indexResult = new ArrayList<>();
        List<Integer> tmpList = new ArrayList<>();
        for (int i : input) {
            tmpList.add(i);
        }

        Iterator<Integer> iterator = tmpList.iterator();
        List<Integer> result = new ArrayList<>();

        while (iterator.hasNext()) {
            Integer value = iterator.next();
            result.add(value * number);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        List<Integer> result = iteratorMultiplier(array, 2);
        System.out.println(result);
    }
}
