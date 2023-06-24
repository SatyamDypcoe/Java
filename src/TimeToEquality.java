//Given an integer array A of size N. In one second, you can increase the value of one element by 1.
//Find the minimum time in seconds to make all elements of the array equal.
//Example Input
//A = [2, 4, 1, 3, 2]
//Example Output
//8
//Example Explanation
//        We can change the array A = [4, 4, 4, 4, 4]. The time required will be 8 seconds
public class TimeToEquality {
    public static void main(String[] args) {
        int[] A = {2, 4, 1, 3, 2};
        System.out.println(solve(A));
    }
    public static int solve(int[] A) {
        int n = A.length;
        int maxNo = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            if(A[i] > maxNo ){
                maxNo = A[i];
            }
        }
        int totalSum = 0;
        for(int i = 0; i < n; i++){
            totalSum = totalSum + A[i];
        }
        int ans =(n*maxNo) - totalSum;
        return ans;
    }
}
