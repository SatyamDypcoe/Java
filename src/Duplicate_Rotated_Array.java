public class Duplicate_Rotated_Array {
    public static void main(String[] args) {
        int[] arr = {2, 9, 2, 2, 2};
        System.out.println(findDupPivot(arr));
    }
    static int findDupPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            int mid = start + (end - start)/2;
            // 4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }
            // if elements at middle, start, end are equal then just skip the duplicates
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                // skip the duplicates
                // Note: what if these elements at starts and end were pivot??
                // check if start is pivot
                if(arr[start] > arr[start + 1] ){
                    return start;
                }
                start++;

                //check whether end is pivot
                if(arr[end] < arr[end - 1]){
                    return end -1 ;
                }
                end--;
            }
            // left side is sorted, so pivot should be in right
            else if(arr[start] < arr[mid] ||  (arr[start] == arr[mid] && arr[mid] > arr[end])){
                start = mid + 1;
            } else{
                end = mid -1;
            }
        }
        return  -1;
    }
}
