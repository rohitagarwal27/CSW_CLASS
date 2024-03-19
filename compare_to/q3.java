package compare_to;

import java.util.*;

public class q3 {
    public static void main(String[] args) {
        // PriorityQueue<Integer> pq = new PriorityQueue<>();
        // pq.add(3);
        // pq.add(1);
        // pq.add(2);
        // pq.add(5);
        // pq.add(4);
        // System.out.println("priority queue" + pq);// follow min heap
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); // COLECTIONS.REVERSEORDER()
                                                                                     // CHANGES TO MAX HEAP
        pq.add(3);
        pq.add(1);
        pq.add(2);
        pq.add(5);
        pq.add(4);
        System.out.println("priority queue" + pq);// follow mAX heap

    }

}
