import java.util.*;

public class Priority_Queues{
    
    public static void main(String args[]){
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.add(3);  // O(log n)
        pq.add(4);
        pq.add(1);
        pq.add(7);

        while(!pq.isEmpty()){
            System.out.println(pq.peek()); // O(1)
            pq.remove(); // O(log n)
        }
    }
}