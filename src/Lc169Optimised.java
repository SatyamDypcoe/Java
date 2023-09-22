public class Lc169Optimised {
    public static void main(String[] args) {
        int[] nums = {10, 9, 9, 9, 10};
        System.out.println(majorityElement(nums));
    }
    public static int majorityElement(int[] nums) {
        int n = nums.length;
        int elem = nums[0];
        int freq = 1;
        for(int i = 1; i < n; i++){
            if(freq == 0){
                elem = nums[i];
            }
            if(elem == nums[i]){
                freq++;
            }else{
                freq--;
            }

        }
        int c = 0;
        for(int i = 0; i < n; i++){
            if(elem == nums[i]){
                c++;
            }
        }
        if(c > (n/2)){
            return elem;
        }
        return -1;
    }
}
