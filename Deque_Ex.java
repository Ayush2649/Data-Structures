import java.util.*;
public class Deque_Ex{

    public static void main(String args[]){
        // Deque<Integer> deque = new LinkedList<>();
        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(1);  //1
        deque.addFirst(2);  //2 1
        deque.addLast(3);   //2 1 3
        deque.addLast(4);   //2 1 3 4 
        System.out.println(deque);
        deque.removeFirst(); //1 3 4
        deque.removeLast();  //1 3
        System.out.println(deque);
        System.out.println("First Element = " + deque.getFirst());
        System.out.println("Last Element = " + deque.getLast());
    }
}