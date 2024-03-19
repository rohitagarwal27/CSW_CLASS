package compare_to;

import java.util.*;

class student implements Comparable<student> {
    private int rollno;
    private String name;
    private int age;

    public student(int rollno, String name, int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }

    public int getRollno() {
        return rollno;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int compareTo(student that) {
        if (this.rollno < that.rollno) {
            return -1;
        } else if (this.rollno > that.rollno)
            return 1;
        else
            return 0;

    }

    // @Override
    // public int compareTo(student o) {
    // // TODO Auto-generated method stub
    // throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
    // }

}

public class q1 {
    public static void main(String[] args) {
        ArrayList<student> al = new ArrayList<>();
        al.add(new student(102, "ram", 31));
        al.add(new student(101, "sita", 30));
        al.add(new student(90, "laxman", 23));

        for (student e : al)
            System.out.println(e.getRollno() + " " + e.getAge() + " " + e.getName());

        Collections.sort(al);
        System.out.println();
        for (student e : al)
            System.out.println(e.getRollno() + " " + e.getAge() + " " + e.getName());

    }
}
