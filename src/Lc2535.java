public class Lc2535 {
    public static void main(String[] args) {
        int[] nums = {2,7,8,10,8,10,1,10,5,9};
        System.out.println(differenceOfSum(nums));
    }
    public static int differenceOfSum(int[] nums) {
        int n = nums.length;
        int s = 0;
        int ds = 0;
        for(int i = 0; i < n; i++){
            s = s + nums[i];
            ds = ds + nums[i]%10;
            int d = nums[i]/10;
            while(d >= 10){
                ds = ds + d%10;
                d = d/10;
            }
            ds = ds + d;
        }
        int ans = s - ds;
        return ans;
    }
}
