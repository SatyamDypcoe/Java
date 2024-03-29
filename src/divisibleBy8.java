//You are given a number A in the form of a string. Check if the number is divisible by eight or not.
//
//Return 1 if it is divisible by eight else, return 0.
//
//Problem Constraints
//1 <= length of the String <= 100000
//'0' <= A[i] <= '9'
//
//Input Format
//The only argument given is a string A.
//
//Output Format
//Return 1 if it is divisible by eight else return 0.
//
//Example Input
//Input 1:
//A = "16"
//Input 2:
//
//A = "123"
//
//Example Output
//Output 1:
//1
//Output 2:
//
//0
//
//Example Explanation
//Explanation 1:
// 16 = 8 * 2
//Explanation 2:
//
//123 = 15 * 8 + 3
public class divisibleBy8 {
    public static void main(String[] args) {
        String A = "123";
        System.out.println(solve(A));
    }
    public static int solve(String A) {
        int n = A.length();
        int exp = 1;
        int ans = 0;
        for(int i = n-1; i>= 0; i--){
            ans = ans + ((A.charAt(i) - '0') * exp)%8;
            exp = (exp*10)%8;
            ans = ans%8;
        }
        if(ans == 0){
            return 1;
        }
        return 0;
    }
}
