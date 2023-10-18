public class Lc55 {
    public static void main(String[] args) {
        int[] nums = {2,3,1,1,4};
        System.out.println(canJump(nums));
    }
    public static boolean canJump(int[] nums) {
        int n = nums.length;
        int c = 0;
        for(int i = 0; i < n; i++){
            if( i > c){
                return false;
            }
            c = Math.max(c, i+nums[i]);
        }
        return true;
    }
}
