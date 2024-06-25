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

        public void heapify(int i){
            int left = 2*i + 1;
            int right = 2*i + 2;
            int minIdx = i;

            if(left < arr.size() && arr.get(minIdx) < arr.get(left)){  // For minHeap change to less than
                minIdx = left;
            }

            if(right < arr.size() && arr.get(minIdx) < arr.get(right)){  // For minHeap change to less than
                minIdx = right;
            }

            if(minIdx != i){
                int temp = arr.get(i);
                arr.set(i, arr.get(minIdx));
                arr.set(minIdx, temp);

                heapify(minIdx);
            }
        }

        public int remove(){
            int data = arr.get(0);

            // Step1 : Swap first and last
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size()-1));
            arr.set(arr.size()-1, temp);

            // Step2 : Delete last node
            arr.remove(arr.size() - 1);

            // Step3 : Heapify
            heapify(0);
            return data;
        }

        public boolean isEmpty(){
        return arr.size() == 0;
    }
    }

    public static void main(String args[]){

    }
}
