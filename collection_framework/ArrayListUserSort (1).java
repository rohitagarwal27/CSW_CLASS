import java.util.*;

class User implements Comparable<User> {
	private String name;
	private int age;
	
	public User(String name, int age) {
		this.name=name;
		this.age=age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public int compareTo(User that) {
	    if (this.age < that.age) 
	        return -1;
	     else if (this.age > that.age) 
	        return 1;
	     else 
	        return 0;
	  // return Integer.compare(this.age, that.age);	
	}
}

public class ArrayListUserSort {

	public static void main(String[] args) {
		
		ArrayList<User> ul=new ArrayList<User>();
		ul.add(new User("Rama",25));
		ul.add(new User("Sita",20));
		ul.add(new User("Laxman",21));
		ul.add(new User("Hanuman",26));
		
		Collections.sort(ul);
				
		System.out.println("User List After Sorting:");
        for (User u : ul) {
            System.out.println("Name: " + u.getName() + ", Age: " + u.getAge());
        }
	}

}
