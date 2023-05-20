public class MountainArray {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 4, 3, 2, 1};
        int ans = mountArr(arr);
        System.out.println(ans);
    }
    static int mountArr(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while (start < end){
            int mid = start + (end-start)/2;
            if(arr[mid] > arr[mid + 1]){
                //you are in desc part of array
                //this may be the ans, but look at left
                //this is why end != mid -1
                end = mid;
            }
            else{
                // you are asc part of array
                start = mid + 1; // because we know that mid + 1 element > mid element
            }
        }
        //in the end, start == end and pointing towards the largest number because of the 2 checks above
        return start; // or return end because both are equal
    }
}
