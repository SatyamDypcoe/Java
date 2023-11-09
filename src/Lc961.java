import java.util.HashSet;

public class Lc961 {
    public static void main(String[] args) {
        int[] nums = {5,1,5,2,5,3,5,4};
        System.out.println(repeatedNTimes(nums));
    }
    public static int repeatedNTimes(int[] nums) {
        int n = nums.length;
        HashSet<Integer> map = new HashSet<>();
        int ans = 0;
        for(int i = 0; i < n; i++){
            if(map.contains(nums[i])){
                ans = nums[i];
            }else{
                map.add(nums[i]);
            }
        }
        return ans;
    }
}
