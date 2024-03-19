package compare_to;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class student {
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

}

class ageComparator implements Comparator<student> {
    public int compare(student s1, student s2) {
        if (s1.getAge() < s2.getAge())
            return -1;
        else if (s1.getAge() > s2.getAge())
            return 1;
        else
            return 0;
    }
}

class Rollcomparator implements Comparator<student> {
    public int compare(student s1, student s2) {
        if (s1.getRollno() < s2.getRollno())
            return -1;
        else if (s1.getRollno() > s2.getRollno())
            return 1;
        else
            return 0;
    }
}

public class q2 {
    public static void main(String[] args) {
        ArrayList<student> al = new ArrayList<>();
        al.add(new student(102, "ram", 31));
        al.add(new student(101, "sita", 30));
        al.add(new student(90, "laxman", 23));

        for (student e : al)
            System.out.println(e.getRollno() + " " + e.getAge() + " " + e.getName());
        System.out.println("=-----------------");
        System.out.println("sorting by age");
        Collections.sort(al, new ageComparator());
        for (student e : al)
            System.out.println(e.getRollno() + " " + e.getAge() + " " + e.getName());
        System.out.println("----------------");
        System.out.println("sorting by roll no");
        Collections.sort(al, new Rollcomparator());
        for (student e : al)
            System.out.println(e.getRollno() + " " + e.getAge() + " " + e.getName());

    }

}
