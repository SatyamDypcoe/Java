public class AmazingSubarray {
    public static void main(String[] args) {
        String A = "ABEC";
        System.out.println(solve(A));
    }
    public static int solve(String A) {
        int n = A.length();
        int c = 0;
        for(int i =0; i < n; i++){
            if(A.charAt(i) == 'A'||A.charAt(i) == 'E'||A.charAt(i) == 'I'||A.charAt(i) == 'O'||A.charAt(i) == 'U'||A.charAt(i) == 'a'||A.charAt(i) == 'e'||A.charAt(i) == 'i'||A.charAt(i) == 'o'||A.charAt(i) == 'u'){
                c = c + (n-i);
            }
            c = c % 10003;
        }
        return c % 10003;
    }
}
