//Implement pow(A, B) % C.
//In other words, given A, B and C, Find (AB % C).
//Note: The remainders on division cannot be negative. In other words, make sure the answer you return is non-negative.
//
//
//Problem Constraints
//-109 <= A <= 109
//0 <= B <= 109
//1 <= C <= 109
//
//
//Input Format
//Given three integers A, B, C.
//
//
//Output Format
//Return an integer.
//
//
//Example Input
//Input 1:
//A = 2
//B = 3
//C = 3
//Input 2:
//A = 3
//B = 3
//C = 1
//
//
//Example Output
//Output 1:
//2
//Output 2:
//0
//
//
//Example Explanation
//Explanation 1:
//23 % 3 = 8 % 3 = 2
//Explanation 2:
//33 % 1 = 27 % 1 = 0
public class PowerFn {
    public static void main(String[] args) {
        int A= 2;
        int B = 3;
        int C= 3;
        System.out.println(pow(A,B,C));
    }
    public static int pow(int A, int B, int C) {
        // Just write your code below to complete the function. Required input is available to you as the function arguments.
        // Do not print the result or any output. Just return the result via this function.
        // return power(A, B, C);
        if(A == 0){
            return 0;
        }
        if(A < 0){
            A = A+C;
        }
        if(B == 0){
            return 1;
        }
        long he = pow(A,B/2,C);
        long ha = (he * he)%C;
        if(B%2 == 0){
            return (int)ha;
        }else{
            return (int)((ha*A)%C + C)%C;
        }
    }
}
