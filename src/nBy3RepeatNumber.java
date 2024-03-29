//You're given a read-only array of N integers. Find out if any integer occurs more than N/3 times in the array in linear time and constant additional space.
//If so, return the integer. If not, return -1.
//
//If there are multiple solutions, return any one.
//
//Note: Read-only array means that the input array should not be modified in the process of solving the problem
//
//Problem Constraints
//1 <= N <= 7*105
//1 <= A[i] <= 109
//
//Input Format
//The only argument is an integer array A.
//
//Output Format
//Return an integer.
//
//Example Input
//Input 1:
//[1 2 3 1 1]
//Input 2:
//[1 2 3]
//
//Example Output
//Output 1:
//1
//Output 2:
//-1
//
//Example Explanation
//Explanation 1:
//1 occurs 3 times which is more than 5/3 times.
//Explanation 2:
//No element occurs more than 3 / 3 = 1 times in the array.
public class nBy3RepeatNumber {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 1, 1};
        System.out.println(repeatedNumber(A));
    }
    public static int repeatedNumber(int[] A) {
        int n = A.length;
        int elem1 = A[0];
        int elem2 = 0;
        int freq1 = 1;
        int freq2 = 0;
        for(int i = 1; i < n; i++){
            if(elem1 == A[i]){
                freq1++;
            }
            else if(elem2 == A[i]){
                freq2++;
            }
            else if(freq1 == 0){
                elem1 = A[i];
                freq1++;
            }
            else if(freq2 == 0){
                elem2 = A[i];
                freq2++;
            }
            else{
                freq1--;
                freq2--;
            }
        }
        int c1 = 0;
        int c2 = 0;
        for(int i = 0; i < n; i++){
            if(elem1 == A[i]){
                c1++;
            }
            if(elem2 == A[i]){
                c2++;
            }
        }
        if(c1 > (n/3)){
            return elem1;
        }
        if(c2 > (n/3)){
            return elem2;
        }
        return -1;
    }
}
