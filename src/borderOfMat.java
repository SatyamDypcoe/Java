import java.util.Arrays;

public class borderOfMat {
    public static void main(String[] args) {
        int[][] A = {
                {1, 5, 7},
                {3, 1, 2},
                {4, 5, 6}
        };
        solve(A);
    }
    public static void solve(int[][] A) {
        int n = A.length;
        int m = A[0].length;
        for(int j = 0; j< n; j++ ){
            int i = 0;
            System.out.println(A[i][j] +" ");;
        }
        for(int i = 1; i< n; i++) {
            int j = n - 1;
            System.out.println(A[i][j] +" ");
        }
        for(int j = n-2; j >= 0; j--){
            int i = n -1;
            System.out.println(A[i][j]);
        }
        int i = 1;
        int j = 0;
        System.out.println(A[i][j]);
    }
}
