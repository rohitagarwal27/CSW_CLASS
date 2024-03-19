import java.util.*;
public class HashMapExample {

	public static void main(String[] args) {
		HashMap<Integer, String> hm=new HashMap<Integer,String>();
		hm.put(1,"Java");
		hm.put(2, "Python");
		hm.put(3, "C");
		hm.put(4, "Java");
		System.out.println("Hash Map:"+hm);
		
		//Traverse using entrySet()
		System.out.println("Iterating HashMap:");
		for(Map.Entry m:hm.entrySet())
			System.out.println(m.getKey()+ " "+m.getValue());
		
		hm.put(4, "Java");
		hm.put(4, "OS");
		System.out.println("Hash Map:"+hm);
		
		//Removing Entries
		hm.remove(3);
		hm.remove(4,"Java");
		hm.remove(4,"OS");
		System.out.println("Hash Map:"+hm);
		
		//traverse using keySet()
         for(Integer k:hm.keySet())
        	 System.out.println(k +" "+ hm.get(k));
         
        hm.put(5, "Os");
 		hm.put(7, "CN");
 		
 		//Check whether a particular key/value exist in a HashMap
 		if(hm.containsKey(5))
 			System.out.println("Key 5 exists");
 		else
 			System.out.println("Key 4 doesnot exist");
 		if(hm.containsValue("C"))
 			System.out.println("Value C exists");
 		else
 			System.out.println("Value C doesnot exist");
 		
 		//replace a value associated with a given key
 		System.out.println(hm.replace(5, "ML"));
 		System.out.println(hm);
	}

}
