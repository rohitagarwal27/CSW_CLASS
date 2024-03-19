package _hash_map;

import java.util.*;

public class q2 {
    public static void main(String[] args) {
        TreeMap<Integer, String> t = new TreeMap<>();
        t.put(1, "java");
        t.put(2, "java1");
        t.put(3, "java2");
        t.put(4, "java");
        t.put(5, "java3");
        System.out.println(" Tree Map " + t);
        TreeMap<String, String> t1 = new TreeMap<>();
        t1.put("ok1", "java");
        t1.put("ok2", "java1");
        t1.put("ok3", "java2");
        t1.put("ok4", "java3");
        t1.put("ok5", "java4");
        System.out.println(" Tree Map " + t1);

    }

}
