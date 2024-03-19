
import java.util.*;
public class QueueExample {

	public static void main(String[] args) {
		LinkedList<Integer> qu=new LinkedList<Integer>();
		for(int i=1; i<=5; i++)
			qu.add(i);	//adds element to the end
        System.out.println("Queue now:"+qu);
        
        System.out.println("Front Removed:"+qu.remove());//To delete front element
        System.out.println("Queue now:"+qu);
        
        System.out.println("Head of queue:"+qu.peek());//returns the ront element (without removing)
        qu.addLast(6); //to add an element at last
        System.out.println("Size of queue:"+qu.size());
        System.out.println("Queue now:"+qu);
	}

}
