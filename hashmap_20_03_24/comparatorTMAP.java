package hashmap_20_03_24;

import java.util.*;
import java.util.TreeMap;
class TCOM implements Comparator<Integer>{
public int compare(Integer aID , Integer Bid){
   // return Integer.compare(aID, Bid); --> output Treemap -->{14=OS, 96=java, 97=java, 98=C, 99=python}
     int comp = (aID-Bid);
     return comp * -1; // here we are changing logic 
      // ---> output Treemap -->{99=python, 98=C, 97=java, 96=java, 14=OS}
}
 
}

public class comparatorTMAP {
    public static void main(String[] args) {
         Map<Integer,String> tmap = new TreeMap<>(new TCOM());
        tmap.put(97, "java");
        tmap.put(99, "python");
        tmap.put(98, "C");
        tmap.put(96, "java");
        tmap.put(14, "OS"); 
        System.out.println("Treemap -->" + tmap);  
    }
    
}
