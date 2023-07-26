//Given an array of integers A, every element appears twice except for one. Find that integer that occurs once.
//
//NOTE: Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
//Example Input
//Input 1:
//
// A = [1, 2, 2, 3, 1]
//Input 2:
//
// A = [1, 2, 2]
//
//
//Example Output
//Output 1:
//
// 3
//Output 2:
//
// 1
//
//
//Example Explanation
//Explanation 1:
//
//3 occurs once.
//Explanation 2:
//
//1 occurs once.
public class SingleNum {
    public static void main(String[] args) {
        int[] A = {1, 2, 2, 3, 1};
        System.out.println(singleNumber(A));
    }
    public static int singleNumber(final int[] A) {
        int n = A.length;
        int ans = 0;
        for(int i =0; i< n; i++){
            ans = ans^A[i];
        }
        return ans;
    }
}
