public class Lc137 {
    public static void main(String[] args) {
        int[] nums = {0,1,0,1,0,1,99};
        System.out.println(singleNumber(nums));
    }
    public static int singleNumber(int[] nums) {
        int n = nums.length;
        int ans = 0;
        for(int i = 0; i < n; i++){
            int c = 0;
            for(int j = 0; j < n; j++){
                if(nums[i] == nums[j]){
                    c++;
                }
            }
            if(c == 1){
                ans = nums[i];
            }
        }
        return ans;
    }
}
