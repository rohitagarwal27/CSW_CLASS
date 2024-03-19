import java.util.*;
public class ListIteratorExample {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("Java");
		al.add("C");
		al.add("C++");
		al.add("Python");
		System.out.println("Iterating Forward: ");
		ListIterator<String> itr=al.listIterator();
		while(itr.hasNext())
			System.out.print(itr.next()+" ");

		//ListIterator<String> itr=al.listIterator(al.size());
		System.out.println("\nIterating Backward: ");
		while(itr.hasPrevious())
			System.out.print(itr.previous()+" ");
	}

}
