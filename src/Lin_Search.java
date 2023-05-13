import java.util.Scanner;
import java.util.Arrays;
public class Lin_Search {
    public static void main(String[] args) {
        int[] arr = {23, 37, 57, 36, 34, 53, 25, 45, 24};
        int target = 23;
        int ans= LinearSearch(arr,target);
        System.out.println(ans);
    }
    //search in the array return the index if item found
    // otherwise return -1
    static int LinearSearch(int[] arr, int target){
        if(arr.length==0){
            return -1;
        }
        for(int i=0; i< arr.length; i++){
            // check for element at every index if it is = target
            int element = arr[i];
            if(element==target){
                return i;
            }
        }
        //this will execute if none of the return statement have above executed
        // hence the target not found
        return -1;
    }
}