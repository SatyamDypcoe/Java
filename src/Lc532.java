import java.util.HashMap;

public class Lc532 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int k = 1;
        System.out.println(findPairs(nums, k));
    }
    public static int findPairs(int[] nums, int k) {
        int n = nums.length;
        int c  = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            if(map.containsKey(nums[i])){
                int freq = map.get(nums[i]);
                map.put(nums[i], freq + 1);
            }else{
                map.put(nums[i], 1);
            }
        }
        for(int i : map.keySet()){
            if(map.containsKey(i + k)){
                if(k > 0 && map.get(i + k) > 0){
                    c++;
                }
                if( k == 0 && map.get(i) > 1){
                    c++;
                }
            }
        }
        return c;
    }
}
