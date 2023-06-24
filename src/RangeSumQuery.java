import java.util.Arrays;

public class RangeSumQuery {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
        int[][] B = {
                {0, 3},
                {1, 2}
        };
        System.out.println(Arrays.toString(rangeSum(A , B)));
    }
    public static long[] rangeSum(int[] A, int[][] B) {
        int n = A.length;
        int q = B.length;
        long[] pf = new long[n];
        pf[0] = A[0];
        long [] ans = new long[q];
        for(int i =1; i< n; i++){
            pf[i] = pf[i-1] + A[i];
        }
        for(int j = 0; j< q; j++){
            int l = B[j][0];
            int r = B[j][1];
            if(l == 0 && r == 0){
                ans[j] = pf[0];
            }else if(l == 0 && r != 0){
                ans[j] = pf[r];
            }else{
                ans[j] = pf[r] - pf[l-1];
            }
        }
        return ans;
    }
}
