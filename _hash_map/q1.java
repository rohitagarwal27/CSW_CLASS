package _hash_map;

import java.util.*;

public class q1 {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1, "java");
        hm.put(2, "java1");
        hm.put(3, "java2");
        hm.put(4, "java");
        hm.put(5, "java3");
        System.out.println(hm);
        // check wheather a particular key/value is present or not
        if (hm.containsKey(4))
            System.out.println("4 exist");
        if (hm.containsKey("java"))
            System.out.println("java value is there");
        hm.remove(3); // return type boolean
        hm.remove(3, "java1"); // use internally equal method
        System.out.println(hm);
        // Traversing entrySet()
        for (Map.Entry e : hm.entrySet()) // entryset converts to setview of the map
            System.out.println(e.getKey() + " " + e.getValue());
        // Traversing keyset()
        for (Integer k : hm.keySet())
            System.out.println("keys " + k + " or to get value from key use this ->> hm.get(k) " + hm.get(k));

    }

}
