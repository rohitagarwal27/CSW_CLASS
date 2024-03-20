package hashmap_20_03_24;
import java.util.*;

public class treemap {
    public static void main(String[] args) {
        Map<Integer,String> tmap = new TreeMap<>();
        tmap.put(97, "java");
        tmap.put(99, "python");
        tmap.put(98, "C");
        tmap.put(96, "java");
        //tmap.put(null, "OS");
       // tmap.put(null, "CN"); // not allowed
        tmap.put(10, null);
        tmap.put(11 ,null);
        System.out.println("Treemap -->" + tmap);  
        // output Treemap -->{10=null, 11=null, 96=java, 97=java, 98=C, 99=python}
         // observation - sorted order
         // doesnot allow null key
         // multiple null values allowed
        
    }
}
