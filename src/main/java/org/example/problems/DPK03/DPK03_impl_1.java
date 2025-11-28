package org.example.problems.DPK03;

import java.util.HashMap;
import java.util.Map;

public class DPK03_impl_1 {
    private final Map<Integer, String> idToNameMap;

    public DPK03_impl_1() {
        idToNameMap = new HashMap<>();
        idToNameMap.put(1, "Marcelo");
    }

    public String lookup(int id) {
        return idToNameMap.getOrDefault(id, "Not Found");
    }

    public static void main(String[] args) {
        DPK03_impl_1 lookupService = new DPK03_impl_1();

        System.out.println("Lookup ID 1: " + lookupService.lookup(1));
        System.out.println("Lookup ID 2: " + lookupService.lookup(2));
    }
}
