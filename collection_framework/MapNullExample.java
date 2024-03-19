import java.util.*;
public class MapNullExample {

	public static void main(String[] args) {
		HashMap<Integer, String> map=new HashMap<Integer,String>();
		map.put(null, "Java");
		map.put(null, "Python");
		System.out.println("Map:"+map.get(null));
		
		TreeMap<Integer, String> tmap=new TreeMap<Integer,String>();
		tmap.put(null, "Java");
		tmap.put(null, "Python");
		System.out.println("Map:"+tmap.get(null));

	}

}
