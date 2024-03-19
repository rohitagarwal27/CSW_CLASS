import java.util.*;
public class TreeMapExample {

	public static void main(String[] args) {
		TreeMap<Integer, String> tm1=new TreeMap<Integer,String>();
		tm1.put(17,"Java");
		tm1.put(19, "Python");
		tm1.put(18, "C");
		tm1.put(16, "Java");
		System.out.println("Tree Map:"+tm1);
		
		TreeMap<String, String> tm2=new TreeMap<String,String>();
		tm2.put("First", "Rama");
		tm2.put("Second","Sita");
		tm2.put("Third", "Laxman");
		tm2.put("Fourth", "Hanuman");
		
		for(Map.Entry m:tm2.entrySet())
			System.out.println(m.getKey()+" "+m.getValue());

	}

}
