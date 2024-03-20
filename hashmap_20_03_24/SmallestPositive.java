package hashmap_20_03_24;
import java.util.*;

public class SmallestPositive {
    public static int findMisiing(int ar[]){
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int e : ar){
            if(hm.containsKey(e)== false)
                hm.put(e, 1);
            else
                hm.put(e,(hm.get(e)+1));

        }
        System.out.println("Hashmap --->" + hm);
        for(int i =1;i<=10;i++){
            if (hm.containsKey(i)==false)
                 return i;

        }
        return 0;
    }
    public static void main(String[] args) {
        int ar[] ={1, 1,2,10,8,7,3,4,6,6,9};
        int missed = findMisiing(ar);
        System.out.println("Smallest Missing Number ->" + missed);
    }
}
//OUTPUT
 // <key: Value(Number Of Occurence)>
// Hashmap --->{1=2, 2=1, 3=1, 4=1, 6=2, 7=1, 8=1, 9=1, 10=1}
// Smallest Missing Number ->5