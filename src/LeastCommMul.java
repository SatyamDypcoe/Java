//The first line contains T which means number of test cases.
//
//Next 2T lines contains input A and B for each testcase.
//First line of each testcase contain an integer A and second line of the testcase contains input B.
//
//Output Format
//
//T lines each containing an integer representing LCM of A & B.
//
//Example Input
//
//Input 1:
//3
//2
//3
//9
//6
//2
//6
//
//Example Output
//
//Output 1:
//6
//18
//6
//
//Example Explanation
//
//Explanation:
//
// In first testcase 6 is the smallest positive integer which is divisible by both 2 (2 * 3 = 6) and 3 (3 * 2 = 6).
// In second testcase 18 is the smallest positive integer which is divisible by both 9 (9 * 2 = 18) and 6 (6 * 3 = 18).
// In third testcase  6 is the smallest positive integer which is divisible by both 2 (2 * 3 = 6) and 6 (6 * 1 = 6)
import java.util.Scanner;
public class LeastCommMul {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i = 0; i < T; i++){
            int A = sc.nextInt();
            int B = sc.nextInt();
            int G = 1;
            for(int j = 1; j <= Math.min(A, B); j++){
                if(A % j == 0 && B % j == 0){
                    G = j;
                }
            }
            int L = A*B/G;
            System.out.println(L);
        }

    }
}
