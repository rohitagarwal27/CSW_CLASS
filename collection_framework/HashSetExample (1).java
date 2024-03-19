import java.util.*;
public class HashSetExample {
  
	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<String>();
		hs.add("Java");
		hs.add("Python");
		hs.add("C");
		hs.add("C++");
		hs.add("Java");
		System.out.println("HashSet:"+hs);
		
		//Number of elements in this HashSet 
		System.out.println("Size:"+hs.size());
		// HashSet contains the specified element
		System.out.println("Contains:"+hs.contains("C"));
		//Removes the specified element from this HashSet 
		hs.remove("C");
		System.out.println("After Remove Contains:"+hs.contains("C"));
		
		System.out.println("Iterating HashSet: ");
		Iterator<String> itr=hs.iterator();
		while(itr.hasNext())
			System.out.print(itr.next()+" ");

	}
}
