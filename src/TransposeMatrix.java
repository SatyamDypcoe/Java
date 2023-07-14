import java.util.Arrays;

//Output Format
//You have to return the Transpose of this 2D matrix.
//Example Input
//Input 1:
//
//A = [[1, 2, 3],[4, 5, 6],[7, 8, 9]]
//Input 2:
//
//A = [[1, 2],[1, 2],[1, 2]]
//
//Example Output
//Output 1:
//
//[[1, 4, 7], [2, 5, 8], [3, 6, 9]]
//Output 2:
//
//[[1, 1, 1], [2, 2, 2]]
//
//Example Explanation
//Explanation 1:
//
//Clearly after converting rows to column and columns to rows of [[1, 2, 3],[4, 5, 6],[7, 8, 9]]
// we will get [[1, 4, 7], [2, 5, 8], [3, 6, 9]].
public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] A = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(Arrays.deepToString(solve(A)));
    }
    static public int[][] solve(int[][] A) {
        int n = A.length;
        int m = A[0].length;
        int[][] ans = new int[m][n];
        for(int i =0; i < n; i++){
            for(int j =0; j<m; j++){
                ans[j][i] = A[i][j];
            }
        }
        return ans;
    }
}
