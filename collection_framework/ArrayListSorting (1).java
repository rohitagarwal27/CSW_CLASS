import java.util.*;
public class ArrayListSorting {
	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(34);
		al.add(56);
		al.add(23);
		al.add(11);
		System.out.println("Before sort:"+al);
		Collections.sort(al);
		System.out.println("After sort:"+al);

		Collections.sort(al,Collections.reverseOrder());
		//Collections.reverse(al);
		System.out.println("After reverse sort:"+al);
	}

}
