package hashmap_20_03_24;
import java.util.*;

class Address{
    private int plotno;
    private String at;
    private String post;
    public Address(int plotno, String at, String post) {
        this.plotno = plotno;
        this.at = at;
        this.post = post;
    }
   // to string 
    public String toString() {
        return "Address [plotno=" + plotno + ", at=" + at + ", post=" + post + "]";
    }

    
}

public class AddressTreeMap {
    public static void main(String[] args) {
        Map<String, Address> tmap = new TreeMap<>();
        tmap.put("Rama", new Address(101, "jaganpur","khandagiri")) ;     
        tmap.put("Sita", new Address(102, "jaganpur_1","khandagiri_1")) ;  
        tmap.put("Hanuman", new Address(103, "jaganpur_","khandagiri_")) ; 
        System.out.println("ITERATING  THE TREEMAP");
        for(var e :tmap.entrySet()){ // Map.Entry<String, Address> // java 10 update u can use var as a type java internally understand intenligently
            System.out.println(e.getKey() + e.getValue()); //
        }   
        System.out.println("------------------------------------");
        for(Map.Entry<String, Address> e : tmap.entrySet())
            System.out.println(e.getKey() + e.getValue());
        System.out.println("---------KEY- VALUE-------");  
        for(String e : tmap.keySet())
        System.out.println(e + tmap.get(e));  

    }
    // Output
    // ITERATING  THE TREEMAP
    // HanumanAddress [plotno=103, at=jaganpur_, post=khandagiri_]
    // RamaAddress [plotno=101, at=jaganpur, post=khandagiri]
    // SitaAddress [plotno=102, at=jaganpur_1, post=khandagiri_1]
    // ------------------------------------
    // HanumanAddress [plotno=103, at=jaganpur_, post=khandagiri_]
    // RamaAddress [plotno=101, at=jaganpur, post=khandagiri]
    // SitaAddress [plotno=102, at=jaganpur_1, post=khandagiri_1]
    // ---------KEY- VALUE-------
    // HanumanAddress [plotno=103, at=jaganpur_, post=khandagiri_]
    // RamaAddress [plotno=101, at=jaganpur, post=khandagiri]
    // SitaAddress [plotno=102, at=jaganpur_1, post=khandagiri_1]
    
}
