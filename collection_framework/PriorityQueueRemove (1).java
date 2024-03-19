import java.util.*;
public class PriorityQueueRemove {

	public static void main(String[] args) {
		PriorityQueue<Integer> minHeap=new PriorityQueue<Integer>();
		int[] arr= {1,2,10,87,3,4,6,5,9};
		for(int i:arr)
			minHeap.add(i);
		
	    System.out.println("Min Heap:"+ minHeap);
	    System.out.println("Remove elements of Min-Heap");
	    while(minHeap.isEmpty()==false)
	    	System.out.print(" "+minHeap.remove());

	}

}
