public class concatNum {
    public static void main(String[] args) {
        int A = 47;
        int B = 53;
        int C = 33;
        System.out.println(solve(A,B,C));
    }
    public static int solve(int A, int B, int C) {
        int min = Math.min(A, Math.min(B, C));
        int max = Math.max(A, Math.max(B, C));
        int mid = (A + B + C) - (max + min);
        int ans = (min * 10000) + (mid * 100) + max;
        return ans;
    }
}
