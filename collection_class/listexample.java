import java.util.*;

public class listexample {
    public static void main(String[] args) {
        ArrayList<String> al1 = new ArrayList<>();
        al1.add("ok");
        al1.add("ok");
        al1.add("ok");
        al1.add("ok");
        al1.add("ok");
        ArrayList<Integer> al2 = new ArrayList<>();
        al2.add(10);
        al2.add(10);
        al2.add(10);
        al2.add(10);

        ArrayList<String> al2string = new ArrayList<>();
        for (Integer i : al2)
            al2string.add(String.valueOf(i));
        al1.addAll(al2string);
        System.out.println(al1);
        System.out.println(al2string);

    }
}
