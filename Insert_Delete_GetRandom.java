import java.util.*;

public class Insert_Delete_GetRandom{

    private ArrayList<Integer> list;
    private Map<Integer, Integer> map;

    public Insert_Delete_GetRandom(){
        list = new ArrayList<>();
        map = new HashMap<>();
    }

    public boolean search(int val){
        return map.containsKey(val);
    }

    public boolean insert(int val){
        if(search(val)){
            return false;
        }

        list.add(val);
        map.put(val, list.size() - 1);
        return true;
    }

    public boolean remove(int val){
        if(!search(val)){
            return false;
        }

        int index = map.get(val);
        list.set(index, list.get(list.size() - 1));
        map.put(list.get(index), index);
        list.remove(list.size() - 1);
        map.remove(val);

        return true;
    }

    public int getRandom(){
        Random rand = new Random();
        return list.get(rand.nextInt(list.size()));
    }
    
     public static void main(String[] args) {
        Insert_Delete_GetRandom set = new Insert_Delete_GetRandom();

        System.out.println("Inserting 10: " + set.insert(10)); 
        System.out.println("Inserting 20: " + set.insert(20)); 
        System.out.println("Inserting 10 again: " + set.insert(10)); 

        System.out.println("Removing 10: " + set.remove(10)); 
        System.out.println("Removing 30: " + set.remove(30)); 

        System.out.println("Random element: " + set.getRandom()); 

        set.insert(30);
        set.insert(40);
        System.out.println("Random element: " + set.getRandom()); 
    }
}

