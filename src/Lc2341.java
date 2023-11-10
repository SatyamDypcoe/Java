//Input: nums = [1,3,2,1,3,2,2]
//Output: [3,1]
//Explanation:
//Form a pair with nums[0] and nums[3] and remove them from nums. Now, nums = [3,2,3,2,2].
//Form a pair with nums[0] and nums[2] and remove them from nums. Now, nums = [2,2,2].
//Form a pair with nums[0] and nums[1] and remove them from nums. Now, nums = [2].
//No more pairs can be formed. A total of 3 pairs have been formed, and there is 1 number leftover in nums.
import java.util.Arrays;
import java.util.HashMap;

public class Lc2341 {
    public static void main(String[] args) {
        int[] nums = {1,3,2,1,3,2,2};
        System.out.println(Arrays.toString(numberOfPairs(nums)));
    }
    public static int[] numberOfPairs(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[2];
        int c1 = 0;
        int c2 = 0;
        for(int i = 0; i < n; i++){
            if(map.containsKey(nums[i])){
                int freq = map.get(nums[i]);
                map.put(nums[i] , freq + 1);
            }else{
                map.put(nums[i], 1);
            }
        }
        for(int i : map.values()){
            c1 += (i/2);
            if(i%2 == 1){
                c2++;
            }
        }
        ans[0] = c1;
        ans[1] = c2;
        return ans;
    }
}
