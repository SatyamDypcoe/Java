//Find the maximum sum of contiguous non-empty subarray within an array A of length N.
//Example Input
//Input 1:
// A = [1, 2, 3, 4, -10]
//Input 2:
// A = [-2, 1, -3, 4, -1, 2, 1, -5, 4]
//Example Output
//Output 1:
// 10
//Output 2:
// 6
//Explanation 1:
//        The subarray [1, 2, 3, 4] has the maximum possible sum of 10.
//        Explanation 2:
//
//        The subarray [4,-1,2,1] has the maximum possible sum of 6.
public class ContSubarrMaxSum {
    public static void main(String[] args) {
        int[] A = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(A));
    }
    public static int maxSubArray(final int[] A) {
        int n = A.length;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i <n ;i++ ){
            int sum = 0;
            for(int j = i; j < n; j++){
                sum = sum + A[j];
                maxSum = Math.max(maxSum, sum);
            }
        }
        return maxSum;
    }
}
