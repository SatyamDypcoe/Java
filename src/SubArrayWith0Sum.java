//Given an array of integers A, find and return whether the given array contains a non-empty subarray with a sum equal to 0.
//
//If the given array contains a sub-array with sum zero return 1, else return 0.
//
//
//
//Problem Constraints
//1 <= |A| <= 100000
//
//-10^9 <= A[i] <= 10^9
//
//
//
//Input Format
//The only argument given is the integer array A.
//
//
//
//Output Format
//Return whether the given array contains a subarray with a sum equal to 0.
//
//
//
//Example Input
//Input 1:
//
// A = [1, 2, 3, 4, 5]
//Input 2:
//
// A = [4, -1, 1]
//
//
//Example Output
//Output 1:
//
// 0
//Output 2:
//
// 1
import java.util.HashMap;

public class SubArrayWith0Sum {
    public static void main(String[] args) {
        int[] A = {4, -1, 1};
        System.out.println(solve(A));
    }
    public static int solve(int[] A) {
        // Just write your code below to complete the function. Required input is available to you as the function arguments.
        // Do not print the result or any output. Just return the result via this function.
        int n = A.length;
        long[] pf = new long[n];
        pf[0] = A[0];
        for(int i = 1; i < n; i++){
            pf[i] = pf[i-1] + A[i];
        }
        HashMap<Long, Long> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            if(map.containsKey(pf[i])){
                long freq = map.get(pf[i]);
                map.put(pf[i], freq + 1);
            }else{
                map.put(pf[i], 1L);
            }
        }
        for(int i = 0; i < n; i++){
            if(pf[i] == 0){
                return 1;
            }
            if(map.get(pf[i]) > 1){
                return 1;
            }
        }
        return 0;
    }
}
