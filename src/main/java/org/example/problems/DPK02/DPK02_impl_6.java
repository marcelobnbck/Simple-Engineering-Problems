package org.example.problems.DPK02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DPK02_impl_6 {
    public static void main(String[] args) {
        List<Integer> n = new ArrayList<>();
        n.add(1);
        n.add(2);
        n.add(3);
        n.add(4);
        n.add(5);

        revert(n);
        System.out.println(n);
    }
        public static <T> void revert(List<T> list) {
            Collections.reverse(list);
        }
}
