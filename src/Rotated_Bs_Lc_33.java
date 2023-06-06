public class Rotated_Bs_Lc_33 {
    public static void main(String[] args) {
    int[] nums = {4, 5, 6, 7, 0, 1, 2};
    int target = 4;
    int ans = search(nums, target);
        System.out.println(ans);
    }
    static int search(int[] nums, int target){
        int pivot = findPivot(nums);
        // if you did not find a pivot, it means the array is not rotated
        if(pivot == -1){
            // just do normal binary search
            return BinarySearch(nums, target, 0, nums.length - 1);
        }
         // if pivot is found, you have found 2 asc sorted array
        if (nums[pivot] == target){
            return pivot;
        }
        if (target >= nums[0]){
            return BinarySearch(nums, target, 0, pivot - 1);
        }
        return BinarySearch(nums, target, pivot + 1, nums.length - 1);
    }
    // find Pivot:-
    static int findPivot(int[] nums){
        int start = 0;
        int end = nums.length - 1;
        while (start <= end){
            int mid = start + (end - start)/2;
            // 4 cases over here
            if (mid < end && nums[mid] > nums[mid + 1]){
                return mid;
            }
            if (mid > start && nums[mid] < nums[mid - 1]){
                return mid - 1;
            }
            if (nums[mid] <= nums[start]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return  -1;
    }
    static int BinarySearch(int[] nums, int target, int start, int end){
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target > nums[mid]){
                start = mid + 1;
            }
            else if(target < nums[mid]){
                end = mid -1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
