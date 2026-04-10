package org.example.problems.DPK08;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DPK08_impl_05 {
    public static List<Integer> iteratorMultiplier(int[] input, int number) {
        List<Integer> inputList = new ArrayList<>();
        for (int i : input) {
            inputList.add(i);
        }

        List<Integer> indexResult = new ArrayList<>();
        Iterator<Integer> it = inputList.iterator();
        while (it.hasNext()) {
            indexResult.add(it.next() * number);
        }
        return indexResult;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        List<Integer> result = iteratorMultiplier(array, 2);
        System.out.println(result);
    }
}
