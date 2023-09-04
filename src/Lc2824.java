import java.util.*;
public class Lc2824 {
    public static void main(String[] args) {
        ArrayList<Integer>nums = new ArrayList<Integer>();
        nums.add(-1);
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(1);
        int target = 2;
        System.out.println(countPairs(nums, target));
    }
    public static int countPairs(List<Integer> nums, int target) {
        int n = nums.size();
        int c = 0;
        for(int i = 0; i < n; i++){
            for(int j = i+ 1; j<n; j++){
                if(nums.get(i) + nums.get(j) < target ){
                    c++;
                }
            }
        }
        return c;
    }
}
