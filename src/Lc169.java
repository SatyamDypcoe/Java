public class Lc169 {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }
    public static int majorityElement(int[] nums) {
        int n = nums.length;
        int ans = 0;
        int count = 0;
        for(int i =0; i < n; i++){
            int c = 0;
            for(int j = 0; j < n; j++){
                if(nums[i] == nums[j]){
                    c++;
                }
            }
            if(count < c){
                count = c;
                ans = nums[i];
            }
        }
        return ans;
    }
}
