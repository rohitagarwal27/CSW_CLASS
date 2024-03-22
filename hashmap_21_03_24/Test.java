import java.util.*;
// Type-Safety, Type-Casting, and Compile-Time checking (without generic vs with generic):
public class Test {

	public static void main(String[] args) {
		//Without Generics, we can store any type objects
		List list1=new ArrayList();
		//list1.add(10);
		list1.add("10");
		list1.add("name");
		//String s1=(String)list1.get(0);
		//String s2=(String)list1.get(1);
		//String s3=(String) list1.get(2);
		//System.out.println(s1);
		//System.out.println(s2);
		
		
		//with Generics, it is required to specify the type of object we need to store
		List<String> list2=new ArrayList<>();
		//list2.add(10);
		list2.add("10");
		list2.add("name");
		//String s4=(String)list2.get(0);
		//String s5=list2.get(1);
		//String s6=list2.get(2);
		//System.out.println(s5);
		//System.out.println(s6);
		

	}

}
