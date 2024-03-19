
import java.util.*;

class Student {
	private String name;
	private int age;
	private double mark;
	public Student(String name, int age, double mark) {
		this.name=name;
		this.age=age;
		this.mark=mark;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", mark=" + mark + "]";
	}
	public boolean equals(Object obj) {
		Student that = (Student) obj;
		if((this.name.equals(that.name)) && (this.age == that.age) && (this.mark == that.mark))
			return true;
		else
			return false;
	}
}
public class StudentLinkedList {

	public static void main(String[] args) {
		LinkedList<Student> st=new LinkedList<Student>();
		st.add(new Student("Rama",20,90));
		st.add(new Student("Sita",20,95));
		st.add(new Student("Laxman",10,88));
		Student ss=new Student("Hanuman",27,68);
		st.add(ss);
		for(Student s:st)
			System.out.println(s);
		//Count the number of objects 
		System.out.println("Size:"+st.size());
		//Search
		System.out.println("\n Enter details of student to search:");
		Scanner sc=new Scanner(System.in);
		System.out.println("Name: ");
		String name=sc.nextLine();
		System.out.println("Age:");
		int age=sc.nextInt();
		System.out.println("Marks:");
		double mark=sc.nextDouble();
		Student obj=new Student(name,age,mark);
		System.out.println("Search:"+st.contains(obj));
		//st.remove(st.get(1));
		//st.remove(obj);
		
		//Override equals method
		Student s1=new Student("Ravan",37,78);
		Student s2=new Student("Ravan",37,78);
		st.add(s1);
		st.add(s2);
		//System.out.println("Student1 equals to student 2: "+s1.equals(s2));
		for(Student s:st)
			System.out.println(s);
		System.out.println("Student4 equals to student 5: "+st.get(4).equals(st.get(5)));
	}

}
