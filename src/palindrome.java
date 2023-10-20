//Given a string A consisting of lowercase characters.
//
//Check if characters of the given string can be rearranged to form a palindrome.
//
//Return 1 if it is possible to rearrange the characters of the string A such that it becomes a palindrome else return 0.
//
//
//
//Problem Constraints
//1 <= |A| <= 105
//
//A consists only of lower-case characters.
//
//
//
//Input Format
//First argument is an string A.
//
//
//
//Output Format
//Return 1 if it is possible to rearrange the characters of the string A such that it becomes a palindrome else return 0.
//
//
//
//Example Input
//Input 1:
//
// A = "abcde"
//Input 2:
//
// A = "abbaee"
//
//
//Example Output
//Output 1:
//
// 0
//Output 2:
//
// 1
//
//
//Example Explanation
//Explanation 1:
//
// No possible rearrangement to make the string palindrome.
//Explanation 2:
//
// Given string "abbaee" can be rearranged to "aebbea" to form a palindrome.
import java.util.HashMap;
public class palindrome {
    public static void main(String[] args) {
        String A = "abbaee";
        System.out.println(solve(A));
    }
    public static int solve(String A) {
        int n = A.length();
        int c = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            if(map.containsKey(A.charAt(i))){
                int freq = map.get(A.charAt(i));
                map.put(A.charAt(i), freq + 1);
            }else{
                map.put(A.charAt(i), 1);
            }
        }
        for(int i = 0; i < n; i++){
            if(map.get(A.charAt(i)) % 2 != 0){
                c++;
                int fre = map.get(A.charAt(i));
                map.put(A.charAt(i), fre - 1);
            }
        }
        if(c > 1){
            return 0;
        }
        return 1;
    }
}
