public class simpleReverse {
    public static void main(String[] args) {
        String A = "Simple";
        System.out.println(solve(A));
    }
    public static String solve(String A) {
        int n = A.length();
        String ans = "";
        for(int i = 0; i < n; i++){
            ans = A.charAt(i) + ans;
        }
        return ans;
    }
}
