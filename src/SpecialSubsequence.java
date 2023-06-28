//Problem Description
//You have given a string A having Uppercase English letters.
//
//You have to find how many times subsequence "AG" is there in the given string.
//Example Input
//Input 1:
// A = "ABCGAG"
//Input 2:
// A = "GAB"
//
//Example Output
//Output 1:
// 3
//Output 2:
// 0
public class SpecialSubsequence {
    public static void main(String[] args) {
        String A = "ABCGAG";
        System.out.println(solve(A));
    }
    public static int solve(String A) {
        int n = A.length();
        int c = 0;
        int ans = 0;
        for(int i = n-1; i>= 0;i--){
            if(A.charAt(i) == 'G'){
                c++;
            }
            else if(A.charAt(i) == 'A'){
                ans = ans + c;
            }
        }
        return ans;
    }
}
