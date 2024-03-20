package hashmap_20_03_24;
import java.util.*;

public class q1 {
    public static void main(String[] args) {
        Map<Integer,String> hmap = new HashMap<>();
        hmap.put(97, "java");
        hmap.put(99, "python");
        hmap.put(98, "C");
        hmap.put(96, "java");
        hmap.put(null, "OS");
        hmap.put(null, "CN");// update null value
        hmap.put(10, null);
        hmap.put(11 ,null);
        System.out.println("HashMap -->" + hmap.entrySet()); // gives set view
        // output -- HashMap -->[96=java, null=CN, 97=java, 98=C, 99=python, 10=null, 11=null]
        //observation -- order is not maintained
        //one null key & multiple null key
        
    }
}
