//Given an array of positive integers A and an integer B, find and return first continuous subarray which adds to B.
//
//If the answer does not exist return an array with a single integer "-1".
//
//First sub-array means the sub-array for which starting index in minimum.
//
//
//
//Problem Constraints
//1 <= length of the array <= 100000
//1 <= A[i] <= 109
//1 <= B <= 109
//
//
//
//Input Format
//The first argument given is the integer array A.
//
//The second argument given is integer B.
//
//
//
//Output Format
//Return the first continuous sub-array which adds to B and if the answer does not exist return an array with a single integer "-1".
//
//
//
//Example Input
//Input 1:
//
// A = [1, 2, 3, 4, 5]
// B = 5
//Input 2:
//
// A = [5, 10, 20, 100, 105]
// B = 110
//
//
//Example Output
//Output 1:
//
// [2, 3]
//Output 2:
//
// [-1]
//
//
//Example Explanation
//Explanation 1:
//
// [2, 3] sums up to 5.
//Explanation 2:
//
// No subarray sums up to required number.
import java.util.ArrayList;
import java.util.HashMap;

public class subArrWithSum {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
        A.add(1);
        A.add(2);
        A.add(3);
        A.add(4);
        A.add(5);
        int B = 5;
        System.out.println(solve(A, B));
    }
    public static ArrayList<Integer> solve(ArrayList<Integer> A, int B) {
        int n = A.size();
        ArrayList<Integer> C = new ArrayList<>();
        HashMap<Long, Integer> map = new HashMap<>();
        Long sum = 0l;
        int s = -1;
        int e = -1;
        map.put(0l, -1);
        for(int i = 0; i < n; i++){
            sum += A.get(i);
            if(map.containsKey(sum - B)){
                s = map.get(sum - B) + 1;
                e = i;
                break;
            }
            map.put(sum, i);
        }
        if(s == -1){
            C.add(-1);
        }else{
            for(int i =s; i <= e; i++){
                C.add(A.get(i));
            }
        }
        return C;
    }
}
