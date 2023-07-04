//Given an array of size N, find the subarray of size K with the least average.
//Input 1:
//A=[3, 7, 90, 20, 10, 50, 40]
//B=3
//Input 2:
//A=[3, 7, 5, 20, -10, 0, 12]
//B=2
//Example Output
//Output 1:
//3
//Output 2:
//4
//Explanation 1:
//Subarray between indexes 3 and 5
//The subarray {20, 10, 50} has the least average
//among all subarrays of size 3.
//Explanation 2:
// Subarray between [4, 5] has minimum average
public class SubarrLeastAvg {
    public static void main(String[] args) {
        int[] A = {3, 7, 90, 20, 10, 50, 40};
        int B = 3;
        System.out.println(solve(A, B));
    }
    public static int solve(int[] A, int B) {
        int n = A.length;
        int min = Integer.MAX_VALUE;
        int index = 0;
        for(int i = 0; i <= n-B; i++){
            int sum = 0;
            for(int j = i; j< i+B; j++){
                sum = sum + A[j];
            }
            if(sum < min){
                min = sum;
                index = i;
            }
        }
        return index;
    }
}
