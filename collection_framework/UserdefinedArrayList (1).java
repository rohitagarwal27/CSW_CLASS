
import java.util.*;
class Course{
	private int cId;
	private String name;
	private int lectureCount;
	public Course(int cId,String name, int lectureCount) {
		this.cId=cId;
		this.name=name;
		this.lectureCount=lectureCount;
	}
	@Override
	public String toString() {
		return "Course [cId=" + cId + ", name=" + name + ", lectureCount=" + lectureCount + "]";
	}
}

public class UserdefinedArrayList {
	
	public static void main(String[] args) {
		ArrayList<Course> al=new ArrayList<Course>();
		al.add(new Course(1,"Java",40));
		al.add(new Course(2,"Python",25));
		al.add(new Course(3,"C++",30));
		System.out.println("Total items="+al.size());
		//System.out.println("Array List:"+al);
		Iterator<Course> itr=al.iterator();
		System.out.println("Iterating Course:");
		while(itr.hasNext())
			System.out.println(itr.next());
	}

}
