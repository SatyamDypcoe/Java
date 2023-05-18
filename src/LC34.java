public class LC34 {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10} ;
        int target = 8;
        //int[] ans = {};
        int[] ans = searchRange(nums, target);
        for(int i:ans) System.out.print(i+" ");
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        int s = search(nums, target, true);
        int e = search(nums, target, false);
         ans[0] = s;
         ans[1] = e;
        return ans;
    }

    public static int search(int[] nums, int target, boolean searchIndex) {
        int ans = -1;
        int s = 0;
        int e = nums.length - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (target < nums[mid]) {
                e = mid - 1;
            } else if (target > nums[mid]) {
                s = mid + 1;
            } else {
                ans = mid;
                if (searchIndex) e = mid - 1;
                else s = mid + 1;

            }
        }

        return ans;
    }
}
