import java.util.*;

public class conversionlist {
    public static void main(String[] args) {
        List<String> al = new ArrayList<String>();
        al.add("java");
        al.add("java_1");
        al.add("java_2");
        al.add("java_3");
        System.out.println(al);
        System.out.println("converting arraylist to array");
        String[] item = al.toArray(new String[al.size()]);
        System.out.println("array is");
        for (String e : al)
            System.out.print(e + " ");

    }
}
