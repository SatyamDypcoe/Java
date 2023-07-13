import java.util.Arrays;

//You are given two integer matrices A and B having same size(Both having same number of rows (N) and columns (M).
// You have to subtract matrix B from A and return the resultant matrix. (i.e. return the matrix A - B).
//If A and B are two matrices of the same order (same dimensions).
// Then A - B is a matrix of the same order as A and B and its elements are obtained by doing an element wise subtraction of A from B.
//Example Input
//
//Input 1:
//
//A =  [[1, 2, 3],
//      [4, 5, 6],
//      [7, 8, 9]]
//
//B =  [[9, 8, 7],
//      [6, 5, 4],
//      [3, 2, 1]]
//Input 2:
//
//A = [[1, 1]]
//
//B = [[2, 3]]
//
//
//Example Output
//
//Output 1:
//
// [[-8, -6, -4],
//  [-2, 0, 2],
//  [4, 6, 8]]
//Output 2:
//
// [[-1, -2]]
//
//
//Example Explanation
//
//Explanation 1:
//
// image
//Explanation 2:
//
// [[1, 1]] - [[2, 3]] = [[1 - 2, 1 - 3]] = [[-1, -2]]
public class MatrixSub {
    public static void main(String[] args) {
        int[][] A = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] B = {
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}
        };
        System.out.println(Arrays.deepToString(solve(A, B)));
    }
    public static int[][] solve(int[][] A, int[][] B) {
        int n = A.length;
        int m = A[0].length;
        int[][] ans = new int[n][m];
        for(int i = 0; i < n ; i++){
            for(int j = 0; j< m; j++){
                ans[i][j] = A[i][j]-B[i][j];
            }
        }
        return ans;
    }
}
