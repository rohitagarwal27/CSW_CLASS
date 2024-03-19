
import java.util.*;
public class StackExample {

	public static void main(String[] args) {
		LinkedList<Integer> stack=new LinkedList<Integer>();
		for(int i=1; i<=5; i++)
			stack.addFirst(i);	//adds element in the top of the stack
        System.out.println("Stack now:"+stack);
        
        System.out.println("Top removed:"+stack.remove());//To delete top element
        System.out.println("Stack now:"+stack);
        
        System.out.println("Top of stack:"+stack.peek());//returns the top element (without removing)
        
        stack.addFirst(6); //to add an element at top
        System.out.println("Size of stack:"+stack.size());
        System.out.println("Stack now:"+stack);
	}

}

