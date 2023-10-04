import java.util.Arrays;

//You are given a function to_lower() which takes a character array A as an argument.
//
//Convert each character of A into lowercase characters if it exists. If the lowercase of a character does not exist, it remains unmodified.
//The uppercase letters from A to Z are converted to lowercase letters from a to z respectively.
//
//Return the lowercase version of the given character array.
//
//Problem Constraints
//1 <= |A| <= 105
//
//Input Format
//The only argument is a character array A.
//
//Output Format
//Return the lowercase version of the given character array.
//
//Example Input
//Input 1:
//
// A = ['S', 'c', 'A', 'l', 'e', 'r', 'A', 'c', 'a', 'D', 'e', 'm', 'y']
//Input 2:
//
// A = ['S', 'c', 'a', 'L', 'e', 'r', '#', '2', '0', '2', '0']
//
//Example Output
//Output 1:
//
// ['s', 'c', 'a', 'l', 'e', 'r', 'a', 'c', 'a', 'd', 'e', 'm', 'y']
//Output 2:
//
// ['s', 'c', 'a', 'l', 'e', 'r', '#', '2', '0', '2', '0']
//
//Example Explanation
//Explanation 1:
//
// All the characters in the returned array are in lowercase alphabets.
//Explanation 2:
// Since there is no lowercase version for '#', '2'and '0'.  It remains unchanged.
// Rest of the Uppercase alphabets are converted to lowercase accordingly.
public class toLower {
    public static void main(String[] args) {
        char[] A = {'S', 'c', 'a', 'L', 'e', 'r', '#', '2', '0', '2', '0'};
        System.out.println(Arrays.toString(to_lower(A)));
    }
    public static char[] to_lower(char[] A) {
        int n = A.length;
        for(int i = 0; i < n; i++){
            //check for uppercase
            if(A[i] >= 65 && A[i] <= 90){ // or A[i] >= 'A' && A[i] <= 'Z'
                A[i] = (char)(A[i] + 32);         // or A[i] = A[i] + ('a' - 'A')
            }
        }
        return A;
    }
}
