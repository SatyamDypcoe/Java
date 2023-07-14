import java.util.*;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(spiralOrder(matrix));
    }
    public static List<Integer> spiralOrder(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int left = 0;
        int right = m-1;
        int top = 0;
        int bot = n-1;
        int dir = 0;

        List<Integer> ans=new ArrayList<Integer>();

        while(left <= right && top <= bot){
            if(dir == 0){                                  // left to right
                for(int i = left; i <= right; i++){
                    ans.add(matrix[top][i]);
                }
                top++;
                dir = 1;
            }
            if(dir == 1){                           // top to bottom;
                for(int i = top; i <= bot; i++){
                    ans.add(matrix[i][right]);

                }
                right--;
                dir = 2;
            }
            if(top > bot || left > right){
                break;
            }
            if(dir == 2){                              //right to left
                for(int i = right; i>= left; i--){
                    ans.add(matrix[bot][i]);
                }
                bot--;
                dir = 3;
            }
            if(dir == 3){                           // bottom to top
                for(int i = bot; i >= top; i--){
                    ans.add(matrix[i][left]);
                }
                left++;
                dir = 0;
            }
        }
        return ans;
    }
}
