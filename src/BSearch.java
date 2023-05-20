public class BSearch {

    // * In Infinite sorted array how to find target position. Amazon Que.
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 6, 7, 8, 10, 11, 12, 15, 20, 23, 30, 90, 100, 130, 140, 160, 170};
        int target = 15;
        System.out.println(ans(arr, target));
    }
    static int ans(int[] arr, int target){
        // First find the range
        // First start with a box of size 2
        int start = 0;
        int end = 1;

        //condition for the target to lie in the range
        while (target > arr[end]){
            int newStart = end + 1;
            // double the box value
            // end = end + (end -  start + 1)*2
            end = end + (end - start + 1)*2;
            start = newStart;
        }
        return BinarySearch(arr, target, start, end);
    }
    static int BinarySearch(int[] arr, int target, int start, int end){
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target > arr[mid]){
                start = mid + 1;
            }
            else if(target < arr[mid]){
                end = mid -1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
