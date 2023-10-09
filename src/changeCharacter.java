import java.util.Arrays;

//You are given a string A of size N consisting of lowercase alphabets.
//
//You can change at most B characters in the given string to any other lowercase alphabet such that the number of distinct characters in the string is minimized.
//
//Find the minimum number of distinct characters in the resulting string.
//
//
//
//Problem Constraints
//1 <= N <= 100000
//
//0 <= B <= N
//
//
//
//Input Format
//The first argument is a string A.
//
//The second argument is an integer B.
//
//
//
//Output Format
//Return an integer denoting the minimum number of distinct characters in the string.
//
//
//
//Example Input
//A = "abcabbccd"
//B = 3
//
//
//
//Example Output
//2
//
//
//
//Example Explanation
//We can change both 'a' and one 'd' into 'b'.So the new string becomes "bbcbbbccb".
//So the minimum number of distinct character will be 2.
public class changeCharacter {
    public static void main(String[] args) {
        String A = "abcabbccd";
        int B = 3;
        System.out.println(solve(A, B));
    }
    public static int solve(String A, int B) {
        int n = A.length();
        if(B >= n){
            return 1;
        }
        int[] freq = new int[26];
        for(int i = 0; i < n; i++){         // counting occurance of char
            int index = A.charAt(i) - 'a';
            freq[index]++;
        }
        int total = 0;              // counting total distinct char
        for(int i = 0; i < 26; i++){
            if(freq[i] > 0){
                total++;
            }
        }
        Arrays.sort(freq);
        int changes = 0;
        for(int i = 0 ; i < 26; i++){
            if(freq[i] > 0 && B - freq[i] >= 0){
                B = B - freq[i];
                changes++;
            }
        }
        return total - changes;
    }
}
