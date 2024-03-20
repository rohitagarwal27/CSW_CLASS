package hashmap_20_03_24;

import java.util.LinkedHashMap;
import java.util.Map;

public class Linkedhashmap {
    public static void main(String[] args) {
        Map<Integer,String> LLmap = new LinkedHashMap<>();
        LLmap.put(97, "java");
        LLmap.put(99, "python");
        LLmap.put(98, "C");
        LLmap.put(96, "java");
        //LLmap.put(null, "OS");
       // LLmap.put(null, "CN"); // not allowed
        LLmap.put(10, null);
        LLmap.put(11 ,null);
        System.out.println("LINKEDHASHMAP -->" + LLmap);  
        // output LINKEDHASHMAP -->{97=java, 99=python, 98=C, 96=java, 10=null, 11=null}
         // observation - INSERTION order
         // ONE NULL KEY
         // multiple null values allowed
    }
    
}
