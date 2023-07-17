import java.util.Arrays;

//You are given a 2D integer matrix A, make all the elements in a row or column zero if the A[i][j] = 0.
// Specifically, make entire ith row and jth column zero.
//
//Problem Constraints
//1 <= A.size() <= 103
//
//1 <= A[i].size() <= 103
//
//0 <= A[i][j] <= 103
//
//Input Format
//First argument is a 2D integer matrix A.
//
//Output Format
//Return a 2D matrix after doing required operations.
//
//Example Input
//Input 1:
//
//[1,2,3,4]
//[5,6,7,0]
//[9,2,0,4]
//
//
//Example Output
//Output 1:
//
//[1,2,0,0]
//[0,0,0,0]
//[0,0,0,0]
//
//
//Example Explanation
//Explanation 1:
//
//A[2][4] = A[3][3] = 0, so make 2nd row, 3rd row, 3rd column and 4th column zero.
public class Row2ColumnZero {
    public static void main(String[] args) {
        int[][] A = {
                {1, 2, 3, 4},
                {5, 6, 7, 0},
                {9, 2, 0, 4}
        };
        System.out.println(Arrays.deepToString(solve(A)));
    }
    public static int[][] solve(int[][] A) {
        int n = A.length;
        int m = A[0].length;
        int[] r = new int[n];
        int[] c = new int[m];
        for(int i =0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(A[i][j] == 0){
                    r[i] = -1;
                    c[j] = -1;
                }
            }

        }
        for(int i =0; i<n;i++){
            for(int j =0; j< m; j++){
                if(r[i] == -1 || c[j] == -1){
                    A[i][j] = 0;
                }
            }
        }
        return A;
    }
}
