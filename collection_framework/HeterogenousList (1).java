import java.util.*;
public class HeterogenousList {

	public static void main(String[] args) {
		
		ArrayList<Object> al=new ArrayList<Object>();
		al.add("String");
		al.add(123);
		al.add(3.14);
		al.add(true);
		System.out.println(al);
		
		LinkedList<Object> ll=new LinkedList<Object>();
		ll.add("String");
		ll.add(123);
		ll.add(3.14);
		ll.add(true);
		System.out.println(ll);
		
		Vector<Object> vc=new Vector<Object>();
		vc.add("String");
		vc.add(123);
		vc.add(3.14);
		vc.add(true);
		System.out.println(vc);
		
	}

}
