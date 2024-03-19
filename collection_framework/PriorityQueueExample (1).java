import java.util.*;
public class PriorityQueueExample {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>();//Min-heap
		//PriorityQueue<Integer> pq=new PriorityQueue<Integer>(Collections.reverseOrder());// Max-heap
		pq.add(3);
		pq.add(1);
		pq.add(2);
		pq.add(5);
		pq.add(4);
		
		System.out.println("Priority Queue:"+pq);
		System.out.println("Iterating the pq:");
		Iterator<Integer> itr=pq.iterator();
		while(itr.hasNext())
			System.out.print(itr.next()+" ");
        System.out.println("\nHead element:"+pq.peek());////Retrieves, but does not remove, the head of this queue,or returns null if this queue is empty.
        System.out.println("Head element:"+pq.element());//Retrieves, but does not remove, the head of this queue. This method differs from peek only in that it throws an exception if this queue is empty. 
        System.out.println("Size: "+pq.size());//Returns the number of elements in this collection. 
        System.out.println("Contains:"+pq.contains(3));//Returns true if this queue contains the specified element. 
        pq.poll(); //Retrieves and removes the head of this queue,or returns null if this queue is empty.
        pq.remove(); // Retrieves, but does not remove, the head of this queue. This method differs from peek only in that it throws an exception if this queue is empty
        System.out.println("Priority Queue Now:"+pq);
        //remove all elements
        pq.clear();
        //check if queue is empty
        System.out.println("Is Queue Empty:"+pq.isEmpty());
        System.out.println("Priority Queue Now:"+pq);
	}

}
