public class LeapYear3 {
    public static void main(String[] args) {
        int A = 2200;
        int ans = solve(A);
        System.out.println(ans);
    }
    public static int solve(int A) {
        if((A % 4== 0 & A % 100 != 0) || A % 400 == 0){
            return 1;
        }
        return 0;
    }
}
