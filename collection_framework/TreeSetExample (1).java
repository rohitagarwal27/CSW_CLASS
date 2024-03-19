import java.util.*;

public class TreeSetExample {
	public static void main(String[] args) {
		TreeSet<Integer> ts=new TreeSet<Integer>();
		ts.add(84);
		ts.add(74);
		ts.add(88);
		ts.add(98);
		ts.add(18);
		ts.add(0);
		System.out.println("Tree Sort:"+ts);
		System.out.println("Traversing descending order:");
		Iterator<Integer> it=ts.descendingIterator();
		while(it.hasNext())
			System.out.print(it.next()+" ");
		//Reverse order
		System.out.println("Reverse set:"+ts.descendingSet());
		//Retrieves and removes the first(lowest) and last(highest) element
		System.out.println("Lowest Value: "+ts.pollFirst());
		System.out.println("Highest value: "+ts.pollLast());
		System.out.println("Tres set now: "+ts);
		//Returns the first(lowest) & last(highest) element currently in this set.
		System.out.println("First element of the set: "+ts.first());
		System.out.println("Last element of the set: "+ts.last());
		System.out.println("Tres set now: "+ts);
	}

}
