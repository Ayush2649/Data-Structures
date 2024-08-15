import java.util.*;

public class Jump_Game2{

    public static int Jumps(int[] nums){
        int totalJumps = 0;
        int destination = nums.length - 1;
        int coverage = 0;
        int lastJumpIndex = 0;

        for(int i = 0; i < nums.length; i++){
            coverage = Math.max(coverage, i + nums[i]);

            if(i == lastJumpIndex){
                lastJumpIndex = coverage;
                totalJumps++;

                if(coverage >= destination){
                    return totalJumps;
                }
            }
        }
        return totalJumps;
    }

    public static void main(String[] args){
        int[] nums = {2, 4, 1, 2, 3, 1, 1, 2};
        System.out.println(Jumps(nums));
    }
}