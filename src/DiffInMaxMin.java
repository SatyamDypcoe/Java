//You are given an array of integers A of size N.
//Return the difference between the maximum among all even numbers of A and the minimum among all odd numbers in A.
public class DiffInMaxMin {
    public static void main(String[] args) {
    int[] A = {-98, 54, -52, 15, 23, -97, 12, -64, 52,85};
        System.out.println(solve(A));
    }
    public static int solve(int[] A) {
        int emax = Integer.MIN_VALUE;
        int omin = Integer.MAX_VALUE;
        for(int i = 0; i< A.length; i++ ){
            if((A[i] % 2 == 0) && (A[i] > emax)){
                emax = A[i];
            }
            else if(((A[i] % 2) !=0) && (A[i] <=omin)){
                omin = A[i];
            }
        }


        // System.out.println(-97%2);
        return emax - omin;
    }
}
