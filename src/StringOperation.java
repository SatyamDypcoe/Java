//Akash likes playing with strings. One day he thought of applying following operations on the string in the given order:
//
//Concatenate the string with itself.
//Delete all the uppercase letters.
//Replace each vowel with '#'.
//You are given a string A of size N consisting of lowercase and uppercase alphabets. Return the resultant string after applying the above operations.
//
//NOTE: 'a' , 'e' , 'i' , 'o' , 'u' are defined as vowels.
//
//
//
//Problem Constraints
//1<=N<=100000
//
//
//Input Format
//First argument is a string A of size N.
//
//
//
//Output Format
//Return the resultant string.
//
//
//
//Example Input
//Input 1:
//A="aeiOUz"
//Input 2:
//A="AbcaZeoB"
//
//
//Example Output
//Output 1:
//"###z###z"
//Output 2:
//"bc###bc###"
//Explanatino 1:
//First concatenate the string with itself so string A becomes "aeiOUzaeiOUz".
//Delete all the uppercase letters so string A becomes "aeizaeiz".
//Now replace vowel with '#', A becomes "###z###z".
//Explanatino 2:
//First concatenate the string with itself so string A becomes "AbcaZeoBAbcaZeoB".
//Delete all the uppercase letters so string A becomes "bcaeobcaeo".
//Now replace vowel with '#', A becomes "bc###bc###".
public class StringOperation {
    public static void main(String[] args) {
        String A = "aeiOUz";
        System.out.println(solve(A));
    }
    public static String solve(String A) {
        int n = A.length();
        String ans = "";
        for(int i = 0; i < n; i++){
            if(A.charAt(i) == 'a'|| A.charAt(i) == 'e'|| A.charAt(i) == 'i'|| A.charAt(i) == 'o'|| A.charAt(i) == 'u'){
                ans = ans + "#";
            }
            else if(A.charAt(i) >= 'A' && A.charAt(i) <= 'Z'){
                continue;
            }else{
                ans = ans + A.charAt(i) ;
            }
        }
        ans = ans + ans;
        return ans;
    }
}