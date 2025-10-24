package org.example.problems.DPK02;

import java.util.ArrayList;
import java.util.List;

public class DPK02_impl_2 {
    public static void revertList(List<Integer> input) {
        int left = 0;
        int right = input.size() - 1;
        while (left < right) {
            int temp = input.get(left);
            input.set(left, input.get(right));
            input.set(right, temp);
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        List<Integer> data = new ArrayList<>();
        data.add(1);
        data.add(2);
        data.add(3);
        data.add(4);
        data.add(5);

        revertList(data);
        System.out.println(data);
    }
}
