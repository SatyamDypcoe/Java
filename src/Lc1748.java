import java.util.HashMap;

public class Lc1748 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,2};
        System.out.println(sumOfUnique(nums));
    }
    public static int sumOfUnique(int[] nums) {
        int n = nums.length;
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            if(map.containsKey(nums[i])){
                int freq = map.get(nums[i]);
                map.put(nums[i], freq + 1);
            }else{
                map.put(nums[i] , 1);
            }
        }
        for(int i = 0; i < n; i++){
            if(map.get(nums[i]) == 1){
                sum += nums[i];
            }
        }
        return sum;
    }
}
