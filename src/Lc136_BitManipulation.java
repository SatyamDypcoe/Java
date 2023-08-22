public class Lc136_BitManipulation {
    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
        System.out.println(singleNumber(nums));
    }
    public static int singleNumber(int[] nums) {
        int n = nums.length;
        int ans = nums[0];
        for(int i = 1; i < n; i++){
            ans = ans^nums[i];
        }
        return ans;
    }
}
