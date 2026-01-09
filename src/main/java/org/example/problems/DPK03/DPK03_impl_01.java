package org.example.problems.DPK03;

import java.util.HashMap;
import java.util.Map;

public class DPK03_impl_01 {
    private final Map<Integer, String> idToNameMap;

    public DPK03_impl_01() {
        idToNameMap = new HashMap<>();
        idToNameMap.put(1, "John");
        idToNameMap.put(2, "Alice");
    }

    public String lookup(int id) {
        return idToNameMap.getOrDefault(id, "Not Found");
    }

    public static void main(String[] args) {
        DPK03_impl_01 lookupService = new DPK03_impl_01();

        System.out.println("Lookup ID 1: " + lookupService.lookup(1));
        System.out.println("Lookup ID 2: " + lookupService.lookup(2));
        System.out.println("Lookup ID 3: " + lookupService.lookup(3));
    }
}
