public class Lc26 {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }
    public static int removeDuplicates(int[] nums) {
        int n = nums.length;
        int k = 0;
        int c = 0;
        int i = 0;
        int j = nums[0];
        while(i < n){
            if(nums[i] == j){
                nums[k] = nums[i];
                k++;
                j++;
                i++;
            }
            else if(nums[i] > j){
                nums[k] = nums[i];
                k++;
                j = nums[i] +1;
                i++;
            }else{
                c++;
                i++;
            }
        }
        return n-c;
    }
}
