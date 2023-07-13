import java.util.Arrays;

//You are given two integer matrices A(having M X N size) and B(having N X P).
// You have to multiply matrix A with B and return the resultant matrix. (i.e. return the matrix AB).
//Example Input
//Input 1:
//
//A = [[1, 2],
//     [3, 4]]
//B = [[5, 6],
//     [7, 8]]
//Input 2:
//
//A = [[1, 1]]
//B = [[2],
//     [3]]
//
//
//Example Output
//Output 1:
//
// [[19, 22],
//  [43, 50]]
//Output 2:
//
// [[5]]
//
//
//Example Explanation
//Explanation 1:
//
//
//Explanation 2:
//
// [[1, 1]].[[2], [3]] = [[1 * 2 + 1 * 3]] = [[5]]
public class MatrixMul {
    public static void main(String[] args) {
        int[][] A = {
                {1, 2},
                {3, 4}
        };
        int[][] B = {
                {5, 6},
                {7, 8}
        };
        System.out.println(Arrays.deepToString(solve(A,B)));
    }
    public static int[][] solve(int[][] A, int[][] B) {
        int n = A.length;
        int m = A[0].length;
        int p = B.length;
        int q = B[0].length;
        int[][] ans = new int[n][q];
        for(int i = 0; i < n; i++){
            for(int j = 0; j< q; j++){
                int s = 0;
                for(int k =0; k < m; k++){
                    s = s + A[i][k] * B[k][j];
                }
                ans[i][j] = s;
            }
        }
        return ans;
    }
}
