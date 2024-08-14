import java.util.*;

public class Jump_Game{


    public static boolean Jump(int[] nums){
        int goal = nums.length - 1;

        for(int i = nums.length - 2; i >= 0; i--){
            if(i + nums[i] >= goal){
                goal = i;
            }
        }
        return goal == 0;
    }

    public static void main(String[] args){
        int[] nums= {3, 2, 1, 0, 4};
        System.out.println(Jump(nums));
    }
}