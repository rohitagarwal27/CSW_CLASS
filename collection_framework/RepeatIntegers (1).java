import java.util.*;
public class RepeatIntegers {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,2,1,7,3,5};
		HashSet<Integer> hs=new HashSet<Integer>();
		System.out.println("Repeating Integers:");
		for(int i:arr) {
			if(hs.add(i)==false)
				System.out.print(i+" ");
		}
		System.out.println("\nHashSet:"+hs);
	}
}
