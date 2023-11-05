import java.util.HashMap;

public class Lc2006 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 1};
        int k = 1;
        System.out.println(countKDifference(nums, k));
    }
    public static int countKDifference(int[] nums, int k) {
        int n = nums.length;
        int c = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            if(map.containsKey(nums[i] + k)){
                c += map.get(nums[i] + k);
            }
            if(map.containsKey(nums[i] - k)){
                c += map.get(nums[i] - k);
            }
            if(map.containsKey(nums[i])){
                int freq = map.get(nums[i]);
                map.put(nums[i], freq + 1);
            }else{
                map.put(nums[i], 1);
            }
        }
        return c;
    }
}
