public class Lc80 {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,1,2,3,3};
        System.out.println(removeDuplicates(nums));
    }
    public static int removeDuplicates(int[] nums) {
        int n = nums.length;
        int i = 0;
        int j = nums[0];
        int k = 0;
        int c = 0;
        int ans = 0;
        while(i < n){
            if(nums[i] == j){
                c++;
                i++;
                if(c < 3){
                    nums[k] = nums[i-1];
                    k++;
                    ans++;
                }
            }
            else if(nums[i] > j){
                j = nums[i];
                c = 0;
            }
        }
        return ans;
    }
}
