public class Lc27 {
    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        int val = 3;
        System.out.println(removeElement(nums, val));
    }
    public static int removeElement(int[] nums, int val) {
        int n = nums.length;
        int i = 0;
        int k = n-1;
        int c = 0;
        while(i <= k){
            if(nums[k] == val){
                k--;
                c++;
            }
            else if(nums[i] == val){
                nums[i] = nums[k];
                c++;
                i++;
                k--;
            }else{
                nums[i] = nums[i];
                i++;
            }
        }

        return n-c;
    }
}
