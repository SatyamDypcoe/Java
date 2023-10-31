//Problem Description
//You are given an array A of size N and you are required to generate another
//array B of size N.
//You have to find minimum value of B[i] for which Summation of (A[i] & B[i]) for i
//= 0 to i = N-1 is minimum possible. Also, you have to select B[i] such that (A[i]
//& B[i]) is a positive value.
//Problem Constraints
//1 <= A.size() <= 100000
//1 <= A[i] <= 100000
//Input Format
//First argument is an integer array A.
//Output Format
//You have to return an integer vector B as per the question.
//Example Input
//Input 1:
//A = [1, 2, 3]
//Input 2:
//A = [2, 8, 9]
//Example Output
//Output 1:
//[1, 2, 1]
//Output 2:
//[2, 8, 1]
//Example Explanation
//Explanation 1:
//For A[0] = 1, AND value (1&1) = 1.
//For A[1] = 2, AND value (2&2) = 2.
//For A[2] = 3, AND value (3&1) = 1.
//Their summation = 1 + 2 + 1 = 4, which is minimum possible.
import java.util.Arrays;

public class generateArray {
    public static void main(String[] args) {
        int[] A = {1, 2, 3};
        System.out.println(Arrays.toString(solve(A)));
    }
    public static int[] solve(int[] A) {
        int n = A.length;
        int[] B = new int[n];
        for(int i = 0; i < n; i++){
            int index = 0;
            while((A[i]>>index & 1) == 0){
                index++;
            }
            B[i] = 1<<index;
        }
        return B;
    }
}
