import java.util.*;
public class ArrayListExample1 {

	public static void main(String[] args) {
	
		ArrayList<String> al = new ArrayList<String>();
		al.add("Java");
		al.add("Python");
		al.add("C");
		al.add("C++");
		System.out.println("Total items="+al.size());
		System.out.println("Array List:"+al);
		
        //Traversing ArrayList using For each Loop
		System.out.println("Iterating Array List:");
		for(String s:al)
			System.out.println(s);
		
		//Traversing ArrayList using Iterator
		Iterator itr=al.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		//ArrayList using indices (traditional way)
		for(int i=0; i<al.size(); i++)
			System.out.println(al.get(i));
		
		System.out.println("IS ArrayList Empty:"+ al.isEmpty());
		al.remove("Java");
		System.out.println("List now="+al);
		
		//al.clear();
		//System.out.println("IS ArrayList Empty:"+ al.isEmpty());
		//System.out.println("List now="+al);
		
		al.add(2,"HTML");
		System.out.println("List now="+al);
		System.out.println("Search:"+al.contains("C++"));
		
	}

}
