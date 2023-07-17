//A = [[1, -2, -3],
//      [-4, 5, -6],
//      [-7, -8, 9]]
public class sumOfMinorDig {
    public static void main(String[] args) {
        int[][] A = {
                {1, -2, -3},
                {-4, 5, -6},
                {-7, -8, 9}
        };
        System.out.println(solve(A));
    }
    public static int solve(int[][] A) {
        int n = A.length;
        int d1 = 0;
        int d2 = 0;
        int i = 0;
        int j = n - 1;
        while (i < n) {
            d1 = d1 + A[i][i];
            i++;
        }
        i = 0;
        while (i < n && j >= 0) {
            d2 = d2 + A[i][j];
            i++;
            j--;

        }
        if (d1 > d2) {
            return d2;
        } else {
            return d1;
        }
    }
}
