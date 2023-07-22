//Given a 0-indexed integer array nums, find a 0-indexed integer array answer where:
//
//answer.length == nums.length.
//answer[i] = |leftSum[i] - rightSum[i]|.
//Where:
//
//leftSum[i] is the sum of elements to the left of the index i in the array nums. If there is no such element, leftSum[i] = 0.
//rightSum[i] is the sum of elements to the right of the index i in the array nums. If there is no such element, rightSum[i] = 0.
//Return the array answer.
//
//
//
//Example 1:
//
//Input: nums = [10,4,8,3]
//Output: [15,1,11,22]
//Explanation: The array leftSum is [0,10,14,22] and the array rightSum is [15,11,3,0].
//The array answer is [|0 - 15|,|10 - 11|,|14 - 3|,|22 - 0|] = [15,1,11,22].
//Example 2:
//
//Input: nums = [1]
//Output: [0]
//Explanation: The array leftSum is [0] and the array rightSum is [0].
//The array answer is [|0 - 0|] = [0].
import java.util.Arrays;

public class Lc2574 {
    public static void main(String[] args) {
        int[] nums = {10,4,8,3};
        System.out.println(Arrays.toString(leftRightDifference(nums)));
    }
    public static int[] leftRightDifference(int[] nums){
        int n = nums.length;
        int[] ans = new int[n];
        int[] right = new int[n];
        int[] left = new int[n];
        int ls = 0;
        int rs = 0;
        right[n-1]  = 0;
        left[0] = 0;
        for(int i = 0; i< n-1; i++){
            ls = ls + nums[i];
            left[i+1] = ls;
        }
        for(int i = n-1; i> 0; i--){
            rs = rs + nums[i];
            right[i-1] = rs;
        }
        for(int i = 0; i < n; i++){
            ans[i] = left[i] - right[i];
            if(ans[i] < 0){
                ans[i] = ans[i] * (-1);
            }
        }
        return ans;
    }
}
