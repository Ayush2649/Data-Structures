import java.util.*;

public class Majority_Element{

    public static int MajorityElement(int[] nums){
        int count = 0; 
        int cand = 0;
        for(int i = 0; i < nums.length; i++){
            if(count == 0){
                cand = nums[i];
            }
            if(cand == nums[i]){
                count++;
            } else {
                count--;
            }
        }
        return cand;
    }

    public static void main(String[] args){
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(MajorityElement(nums));
    }
}