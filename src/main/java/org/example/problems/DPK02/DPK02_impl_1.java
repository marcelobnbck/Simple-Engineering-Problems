package org.example.problems.DPK02;

import java.util.ArrayList;
import java.util.List;

public class DPK02_impl_1 {
    public static List<Integer> revertList(List<Integer> input) {
        List<Integer> reversed = new ArrayList<>();
        for (int i = input.size() - 1; i >= 0; i--) {
            reversed.add(input.get(i));
        }
        return reversed;
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
