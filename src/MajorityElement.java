//Given an array of size N, find the majority element. The majority element is the element that appears more than floor(n/2) times.
//You may assume that the array is non-empty and the majority element always exists in the array.
//
//Problem Constraints
//1 <= N <= 5*105
//1 <= num[i] <= 109
//
//Input Format
//Only argument is an integer array.
//
//Output Format
//Return an integer.
//
//Example Input
//Input 1:
//[2, 1, 2]
//Input 2:
//[1, 1, 1]
//
//Example Output
//Input 1:
//2
//Input 2:
//1
//
//Example Explanation
//For Input 1:
//2 occurs 2 times which is greater than 3/2.
//For Input 2:
// 1 is the only element in the array, so it is majority
public class MajorityElement {
    public static void main(String[] args) {
        int[] A = {2, 1, 2};
        System.out.println(majorityElement(A));
    }
    public static int majorityElement(final int[] A) {
        int n = A.length;
        int elem = A[0];
        int freq = 1;
        for(int i = 1; i < n; i++){
            if(freq == 0){
                elem = A[i];
            }
            else if(elem != A[i]){
                freq--;
            }
            else{
                freq++;
            }
        }
        int c = 0;
        for(int i = 0; i < n; i++){
            if(elem == A[i]){
                c++;
            }
        }
        if(c > (n/2)){
            return elem;
        }
        return -1;
    }
}
