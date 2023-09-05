//ou have an array A with N elements. We have two types of operation available on this array :
//We can split an element B into two elements, C and D, such that B = C + D.
//We can merge two elements, P and Q, to one element, R, such that R = P ^ Q i.e., XOR of P and Q.
//You have to determine whether it is possible to convert array A to size 1, containing a single element equal to 0 after several splits and/or merge?
//
//
//
//Problem Constraints
//1 <= N <= 100000
//
//1 <= A[i] <= 106
//
//
//
//Input Format
//The first argument is an integer array A of size N.
//
//
//
//Output Format
//Return "Yes" if it is possible otherwise return "No".
//
//
//
//Example Input
//Input 1:
//
// A = [9, 17]
//Input 2:
//
// A = [1]
//
//
//Example Output
//Output 1:
//
// Yes
//Output 2:
//
// No
public class IntrestingArr {
    public static void main(String[] args) {
        int[] A = {9, 17};
        System.out.println(solve(A));
    }
    public static String solve(int[] A) {
        int n = A.length;
        String ans = "";
        if(n <= 1){
            return "No";
        }
        int oddc = 0;
        for(int i =0 ; i < n ; i++){
            if(A[i] % 2 == 1){
                oddc++;
            }
        }
        if(oddc % 2 == 0){
            return "Yes";
        }else{
            ans = "No";
        }
        return ans;
    }
}
