package org.example.problems.DPK02;

import java.util.ArrayList;
import java.util.List;

public class DPK02_impl_3 {
    public static List<Integer> revertList(List<Integer> input) {
        if (input.isEmpty()) {
            return new ArrayList<>();
        }

        int last = input.get(input.size() - 1);
        List<Integer> sublist = input.subList(0, input.size() - 1);

        List<Integer> result = new ArrayList<>();
        result.add(last);
        result.addAll(revertList(sublist));

        return result;
    }

    public static void main(String[] args) {
        List<Integer> data = new ArrayList<>();
        data.add(1);
        data.add(2);
        data.add(3);
        data.add(4);
        data.add(5);

        System.out.println(revertList(data));
    }
}
