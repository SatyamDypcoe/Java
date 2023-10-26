//Surprisingly, in an alien language, they also use English lowercase letters, but possibly in a different order. The order of the alphabet is some permutation of lowercase letters.
//
//Given an array of words A of size N written in the alien language, and the order of the alphabet denoted by string B of size 26, return 1 if and only if the given words are sorted lexicographically in this alien language else, return 0.
//
//
//
//Problem Constraints
//1 <= N, length of each word <= 105
//
//Sum of the length of all words <= 2 * 106
//
//
//
//Input Format
//The first argument is a string array A of size N.
//
//The second argument is a string B of size 26, denoting the order.
//
//
//
//Output Format
//Return 1 if and only if the given words are sorted lexicographically in this alien language else, return 0.
//
//
//
//Example Input
//Input 1:
//
// A = ["hello", "scaler", "interviewbit"]
// B = "adhbcfegskjlponmirqtxwuvzy"
//Input 2:
//
// A = ["fine", "none", "bush"]
// B = "qwertyuiopasdfghjklzxcvbnm"
//
//
//Example Output
//Output 1:
//
// 1
//Output 2:
//
// 0
//
//
//Example Explanation
//Explanation 1:
//
// The order shown in string B is: h < s < i (adhbcfegskjlponmirqtxwuvzy) for the given words.
// So, Return 1.
//Explanation 2:
//
// "none" should be present after "bush", Since b < n (qwertyuiopasdfghjklzxcvbnm).
// So, Return 0.
import java.util.HashMap;

public class isDictionary {
    public static void main(String[] args) {
        String[] A ={"hello", "scaler", "interviewbit"};
        String B ="adhbcfegskjlponmirqtxwuvzy";
        System.out.println(solve(A, B));
    }
    public static int solve(String[] A, String B) {
        HashMap<Character, Integer> map = new HashMap<>();
        int n = A.length;
        if(n == 1){
            return 1;
        }
        int m = B.length();
        for(int i = 0; i < m; i++){
            map.put(B.charAt(i), i);
        }
        for(int i = 1; i < n; i++){
            int ind1 = map.get(A[i-1].charAt(0));
            int ind2 = map.get(A[i].charAt(0));
            if(ind1 > ind2){
                return 0;
            }
            else if(ind1 == ind2 && A[i-1].length() > A[i].length()){
                return 0;
            }
        }
        return 1;
    }
}
