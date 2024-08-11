import java.util.*;

public class Remove_Duplicate_From_Sorted_Array2{

    public static int removeDuplicate2(int[] nums){
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(i < nums.length - 2 && nums[i] == nums[i + 2]){
                continue;
            } else {
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args){
        int[] nums = {1, 1, 1, 2, 2, 3};
        System.out.println(removeDuplicate2(nums));
    }
}