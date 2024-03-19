import java.util.*;
public class LinkedHashMapExample {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> lhmap1=new LinkedHashMap<Integer,String>();
		lhmap1.put(17,"Java");
		lhmap1.put(19, "Python");
		lhmap1.put(18, "C");
		lhmap1.put(16, "Java");
		System.out.println("LinkedHash Map:"+lhmap1);
		
		LinkedHashMap<String, String> lhmap2=new LinkedHashMap<String,String>();
		lhmap2.put("First", "Rama");
		lhmap2.put("Second","Sita");
		lhmap2.put("Third", "Laxman");
		lhmap2.put("Fourth", "Hanuman");
		
		for(Map.Entry m:lhmap2.entrySet())
			System.out.println(m.getKey()+" "+m.getValue());

	}

}
