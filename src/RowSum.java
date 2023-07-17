import java.util.Arrays;

//Example Input
//Input 1:
//
//[1,2,3,4]
//[5,6,7,8]
//[9,2,3,4]
//
//
//Example Output
//Output 1:
//
//[10,26,18]
//
//
//Example Explanation
//Explanation 1
//
//Row 1 = 1+2+3+4 = 10
//Row 2 = 5+6+7+8 = 26
//Row 3 = 9+2+3+4 = 18
public class RowSum {
    public static void main(String[] args) {
        int[][] A = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 2, 3, 4}
        };
        System.out.println(Arrays.toString(solve(A)));
    }
    public static int[] solve(int[][] A) {
        int n = A.length;
        int m = A[0].length;
        int[] ans = new int[n];
        for(int i = 0; i < n ; i++){
            int s = 0;
            for(int j =0; j< m; j++){
                s = s + A[i][j];
            }
            ans[i] = s;
        }
        return ans;
    }
}
