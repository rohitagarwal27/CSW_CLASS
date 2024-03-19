import java.util.*;

public class LinkedHashSetExample { 
	public static void main(String[] args) {
		LinkedHashSet<String> lhs=new LinkedHashSet<String>();
		lhs.add("Java");
		lhs.add("Python");
		lhs.add("C");
		lhs.add("C++");
		lhs.add("Java");
		System.out.println("HashSet:"+lhs);
		
		//Number of elements in this HashSet 
		System.out.println("Size:"+lhs.size());
		// HashSet contains the specified element
		System.out.println("Contains:"+lhs.contains("C"));
		//Removes the specified element from this HashSet 
		lhs.remove("C");
		System.out.println("After Remove Contains:"+lhs.contains("C"));
		
		System.out.println("Iterating HashSet: ");
		Iterator<String> itr=lhs.iterator();
		while(itr.hasNext())
			System.out.print(itr.next()+" ");
	}
}

