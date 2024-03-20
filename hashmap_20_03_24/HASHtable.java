package hashmap_20_03_24;

import java.util.Hashtable;
 
import java.util.Map;

public class HASHtable {
    public static void main(String[] args) {
         Map<Integer,String> hastab = new Hashtable<>();
        hastab.put(97, "java");
        hastab.put(99, "python");
        hastab.put(98, "C");
        hastab.put(96, "java");
        //hastab.put(null, "OS");
       // hastab.put(null, "CN"); // not allowed
       // hastab.put(10, null);// Exception- null poiner exception
       // hastab.put(11 ,null);
        System.out.println("hashtable -->" + hastab);  
        // output hashtable -->{98=C, 97=java, 96=java, 99=python}
        // output again  can be different order
         // observation -   order not maintain
         // dosenot allow any null key or null value
        
    }
    
}
