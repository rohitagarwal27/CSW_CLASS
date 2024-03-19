import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class listiterator {
    public static void main(String[] args) {
        ArrayList<String> l1 = new ArrayList<>();
        l1.add("i");
        l1.add("i1");
        l1.add("i2");
        // ListIterator<String> itr = l1.listIterator(l1.size()); // pointer is pointing
        // backward
        ListIterator<String> itr = l1.listIterator(); // pointer is pointing forward
        while (itr.hasNext())//
            System.out.println(itr.next());// if u comment above and this line and print backward then error
        System.out.println("iterarting backward");
        while (itr.hasPrevious())
            System.out.println(itr.previous());
    }
}
