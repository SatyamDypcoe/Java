import java.util.Arrays;

//Given an integer A, generate a square matrix filled with elements from 1 to A2 in spiral order and return the generated square matrix.
//
//
//
//Problem Constraints
//1 <= A <= 1000
//
//
//
//Input Format
//First and only argument is integer A
//
//
//Output Format
//Return a 2-D matrix which consists of the elements added in spiral order.
//
//
//
//Example Input
//Input 1:
//
//1
//Input 2:
//
//2
//Input 3:
//
//5
//
//
//Example Output
//Output 1:
//
//[ [1] ]
//Output 2:
//
//[ [1, 2],
//  [4, 3] ]
//Output 3:
//
//[ [1,   2,  3,  4, 5],
//  [16, 17, 18, 19, 6],
//  [15, 24, 25, 20, 7],
//  [14, 23, 22, 21, 8],
//  [13, 12, 11, 10, 9] ]
//
//
//Example Explanation
//Explanation 1:
//
//Only 1 is to be arranged.
public class SpiralMat2 {
    public static void main(String[] args) {
        int A = 5;
        System.out.println(Arrays.deepToString(generateMatrix(A)));
    }
    public static int[][] generateMatrix(int A) {
        int n = A;
        int left = 0;
        int right = n-1;
        int top = 0;
        int bot = n-1;
        int dir = 0;
        int[][] ans = new int[n][n];
        int c = 1;

        while(left <= right && top <= bot){
            if(dir == 0){                                  // left to right
                for(int i = left; i <= right; i++){
                    ans[top][i] = c++;
                }
                top++;
                dir = 1;
            }
            if(dir == 1){                           // top to bottom;
                for(int i = top; i <= bot; i++){
                    ans[i][right] = c++;

                }
                right--;
                dir = 2;
            }
            if(top > bot || left > right){
                break;
            }
            if(dir == 2){                              //right to left
                for(int i = right; i>= left; i--){
                    ans[bot][i] = c++;
                }
                bot--;
                dir = 3;
            }
            if(dir == 3){                           // bottom to top
                for(int i = bot; i >= top; i--){
                    ans[i][left] = c++;
                }
                left++;
                dir = 0;
            }
        }
        return ans;
    }
}
