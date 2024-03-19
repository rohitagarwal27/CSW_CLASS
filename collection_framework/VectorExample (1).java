import java.util.*;
public class VectorExample {

	public static void main(String[] args) {
		// Create a vectorwith initial capacity 20
		Vector<Integer> vc=new Vector<Integer>(20);
		
		//Add elements
		for(int i=1; i<=20; i++)
			vc.add(i*10);
		System.out.println("Vector list: "+vc);
		
		System.out.println("First element: "+vc.firstElement());
		System.out.println("Last element: "+vc.lastElement());
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Element: ");
		int ele=sc.nextInt();
		System.out.println("Element: "+ele+" is present in the Vector! "+vc.contains(ele));
		
		int index=5;
		System.out.println("Removed element:"+vc.remove(index));
		System.out.println("Vector now: "+vc);
		
		//check capacity and size
		System.out.println("Capacity of vector: "+ vc.capacity());
		System.out.println("Size of vector: "+vc.size());
		
		for(Integer v:vc)
			System.out.print(v+" ");
		System.out.println();
		Iterator it=vc.iterator();
		while(it.hasNext())
			System.out.print(it.next()+" ");

	}

}
