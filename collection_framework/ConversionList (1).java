import java.util.*;
public class ConversionList {
	
public static void main(String[] args) {
		
	    //Convert ArrayList to Array
		ArrayList<String> al=new ArrayList<>();
		al.add("Java");
		al.add("C++");
		al.add("Python");
		String[] items=al.toArray(new String[al.size()]);
		System.out.println("Array is:");
		for(String s:items)
			System.out.print(s+", ");
		
		
		//Convert Array to ArrayList
		String[] arr= {"OS","CN","AI","C"};
		System.out.println("\nConverting Array to ArrayList:");
		List<String> list=new ArrayList<>();
		list=Arrays.asList(arr);
		System.out.println("List="+list);
		
		//Join multiple ArrayLists
		ArrayList<String> al1=new ArrayList<String>();
		al1.add("Rama");
		al1.add("Sita");
		al1.add("Laxman");
		ArrayList<Integer> al2=new ArrayList<Integer>();
		al2.add(90);
		al2.add(95);
		al2.add(85);
		ArrayList<String> al2String = new ArrayList<>();
		for (Integer i : al2)
		    al2String.add(String.valueOf(i));
		
		al1.addAll(al2String);
		System.out.println(al1);
		
		//Find Common elements of lists
		ArrayList<String> alist=new ArrayList<String>();
		alist.add("Rama");
		alist.add("Sita");
		alist.add("Laxman");
		ArrayList<String> blist=new ArrayList<String>();
		blist.add("Ragav");
		blist.add("Sita");
		blist.add("Hanuman");
		blist.retainAll(alist);
		System.out.println(blist);
		
		
	}
}
