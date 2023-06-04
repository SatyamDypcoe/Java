public class BitonicLeetCode1095 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 3, 1, 0};
        int target = 6;
        int ans = search(arr, target);
        System.out.println(ans);
    }
    static int search(int[]arr, int target){
        int peak = peakIndex(arr);
        int firstTry = binarySearch(arr, target, 0, peak);
        if (firstTry != -1){
            return firstTry;
        }else {
            // try to search in second half
            return binarySearch(arr, target, peak + 1, arr.length - 1);
        }
    }

    static int peakIndex(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start < end) {
            int mid = start + (end-start)/2;
            if(arr[mid] > arr[mid + 1]){
                end = mid;
            }else{
                start = mid + 1;
            }
        }
        return start;
    }

    static int binarySearch(int[]arr, int target, int start, int end){

        //find whether the array is sorted in assc or desc
        boolean isAsc = arr[start] < arr[end] ;
        while (start <= end) {
            int mid = start + (end - start)/2;

            if (arr[mid] == target){
                return mid;
            }
            if (isAsc){
                if(target < arr[mid]){
                    end = mid -1;
                }else{
                        start = mid + 1;
                }
            }else {
                if(target > arr[mid]){
                    end = mid -1;
                }else{
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
