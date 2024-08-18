import java.util.*;

public class Product_Of_Array_Except_Self{

    public int[] productExceptSelf(int[] nums){
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];

        left[0] = 1;
        for(int i = 1; i < nums.length; i++){
            left[i] = left[i - 1] * nums[i - 1];
        }

        right[nums.length - 1] = 1;
        for(int i = nums.length - 2; i > -1; i--){
            right[i] = right[i + 1] * nums[i + 1];
        }

        int[] answer = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            answer[i] = left[i] * right[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        Product_Of_Array_Except_Self obj = new Product_Of_Array_Except_Self();
        int[] result = obj.productExceptSelf(nums);
        for(int i : result){
            System.out.print(i + " ");
            }
    }
}