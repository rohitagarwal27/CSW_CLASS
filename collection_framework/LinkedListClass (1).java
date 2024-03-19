
import java.util.*;

public class LinkedListClass {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Java");
		ll.add("Python");
		ll.add("C");
		ll.add("C++");
		System.out.println("Total items="+ll.size());
		System.out.println("Linked List:"+ll);
		
		//Traversing LinkedList using Iterator
		Iterator itr=ll.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		//Adding and Removing elements
		ll.addFirst("OS");
		ll.addLast("CN");
		System.out.println("Linked List:"+ll);
		System.out.println("First element:"+ll.getFirst());
		System.out.println("First element:"+ll.getLast());
		ll.removeFirst();
		ll.removeLast();
		System.out.println("After removing:"+ll);
		
		//Reverse a LinkedList
		System.out.println("Reverse List:");
		Iterator<String> it=ll.descendingIterator();
		while(it.hasNext())
			System.out.print(it.next()+" ");


	}

}
