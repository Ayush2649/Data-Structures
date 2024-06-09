import java.util.*;
public class Stacks_Using_ArrayList{
    static class Stack{
        static ArrayList<Integer> list = new ArrayList<>();
        
        //isEmpty
        public static boolean isEmpty(){
            return list.size() == 0;
        }

        //Push
        public static void push(int data){
            list.add(data);
        }

        //Pop
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        //Peek
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return list.get(list.size() - 1);
        }
    }

    public static void main(String args[]){
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}