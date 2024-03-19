import java.util.*;
public class HashSetFromArrayList {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("Java");
		al.add("Python");
		al.add("C");
		al.add("Java");
		System.out.println("Array List: "+al);
		
		HashSet<String> hs=new HashSet<String>(al);
		hs.add("ML");
		System.out.println("Hash Set: "+hs);

	}

}
