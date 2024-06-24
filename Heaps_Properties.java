import java.util.*;

public class Heaps_Properties{

    static class Heap { 
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data){  // O(log n)
            arr.add(data);

            int child = arr.size() - 1;
            int par = (child - 1)/2;

            while(arr.get(child) < arr.get(par)){
                int temp = arr.get(child);
                arr.set(child, arr.get(par));
                arr.set(par, temp);
            }
        }

        public int peek(){
            return arr.get(0);
        }
    }

    public static void main(String args[]){

    }
}