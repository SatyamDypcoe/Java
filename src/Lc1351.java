//Given a m x n matrix grid which is sorted in non-increasing order both row-wise and column-wise, return the number of negative numbers in grid.
//
//Example 1:
//
//Input: grid = [[4,3,2,-1],[3,2,1,-1],[1,1,-1,-2],[-1,-1,-2,-3]]
//Output: 8
//Explanation: There are 8 negatives number in the matrix.
public class Lc1351 {
    public static void main(String[] args) {
        int[][] grid = {
                {4,3,2,-1},
                {3,2,1,-1},
                {1,1,-1,-2},
                {-1,-1,-2,-3}
        };
        System.out.println(countNegatives(grid));
    }
    public static int countNegatives(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int c = 0;
        for(int i =0; i<n; i++){
            for(int j = 0; j< m; j++){
                if(grid[i][j] < 0){
                    c++;
                }
            }
        }
        return c;
    }
}
