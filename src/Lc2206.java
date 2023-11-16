import java.util.HashMap;

public class Lc2206 {
    public static void main(String[] args) {
        int[] nums ={3,2,3,2,2,2};
        System.out.println(divideArray(nums));
    }
    public static boolean divideArray(int[] nums) {
        int n = nums.length;
        if(n % 2 == 1){
            return false;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            if(map.containsKey(nums[i])){
                int freq = map.get(nums[i]);
                map.put(nums[i], freq +1);
            }else{
                map.put(nums[i], 1);
            }
        }
        for(int i : map.values()){
            if(i % 2 == 1){
                return false;
            }
        }
        return true;
    }
}
