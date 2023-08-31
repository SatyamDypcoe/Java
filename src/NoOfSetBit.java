//Write a function that takes an integer and returns the number of 1 bits present in its binary representation.
//Problem Constraints
//1 <= A <= 109
//
//Input Format
//First and only argument contains integer A
//
//Output Format
//Return an integer
//
//Example Input
//Input 1:
//11
//Input 2:
//6
//Example Output
//Output 1:
//3
//Output 2:
//2
public class NoOfSetBit {
    public static void main(String[] args) {
        int A = 11;
        System.out.println(numSetBits(A));
    }
    public static int numSetBits(int A) {
        int c =0;
        while(A > 0){
            if((A & 1) == 1){
                c++;
            }
            A = A >> 1;
        }
        return c;
    }
}
