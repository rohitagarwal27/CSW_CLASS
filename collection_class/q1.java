import java.util.*;

public class q1 {
    public static void main(String[] args) {
        Vector<Integer> vc = new Vector<>();
        for (int i = 1; i <= 41; i++)
            vc.add(i);
        System.out.println("1stele" + vc.firstElement());
        System.out.println("lastelement" + vc.lastElement());
        vc.contains(1);
        int indx = 5;
        System.out.println("rempove element" + vc.remove(indx));
        System.out.println("size" + vc.size());
        System.out.println("capacity " + vc.capacity()); // default capicity 20

    }
}