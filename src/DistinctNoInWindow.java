//You are given an array of N integers, A1, A2 ,..., AN and an integer B. Return the of count of distinct numbers in all windows of size B.
//
//Formally, return an array of size N-B+1 where i'th element in this array contains number of distinct elements in sequence Ai, Ai+1 ,..., Ai+B-1.
//
//NOTE: if B > N, return an empty array.
//
//
//
//Problem Constraints
//1 <= N <= 106
//
//1 <= A[i] <= 109
//
//
//Input Format
//First argument is an integer array A
//Second argument is an integer B.
//
//
//
//Output Format
//Return an integer array.
//
//
//
//Example Input
//Input 1:
//
// A = [1, 2, 1, 3, 4, 3]
// B = 3
//Input 2:
//
// A = [1, 1, 2, 2]
// B = 1
//
//
//Example Output
//Output 1:
//
// [2, 3, 3, 2]
//Output 2:
//
// [1, 1, 1, 1]
//
//
//Example Explanation
//Explanation 1:
//
// A=[1, 2, 1, 3, 4, 3] and B = 3
// All windows of size B are
// [1, 2, 1]
// [2, 1, 3]
// [1, 3, 4]
// [3, 4, 3]
// So, we return an array [2, 3, 3, 2].
//Explanation 2:
//
// Window size is 1, so the output array is [1, 1, 1, 1].
import java.util.ArrayList;
import java.util.HashMap;

public class DistinctNoInWindow {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
        A.add(1);
        A.add(2);
        A.add(1);
        A.add(3);
        A.add(4);
        A.add(3);
        int B = 3;
        System.out.println(dNums(A,B));
    }
    public static ArrayList<Integer> dNums(ArrayList<Integer> A, int B) {
        ArrayList<Integer> res = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = A.size();
        for(int i = 0; i < B; i++){
            if(map.containsKey(A.get(i))){
                int freq = map.get(A.get(i));
                map.put(A.get(i), freq + 1);
            }else{
                map.put(A.get(i), 1);
            }
        }
        res.add(map.size());
        int i = 1;
        int j = B;
        while(i <= n-B){
            int freq = map.get(A.get(i -1));
            map.put(A.get(i-1), freq -1);
            if(map.get(A.get(i -1))== 0){
                map.remove(A.get(i-1));
            }
            if(map.containsKey(A.get(j))){
                int fre = map.get(A.get(j));
                map.put(A.get(j), fre + 1);
            }else{
                map.put(A.get(j), 1);
            }
            res.add(map.size());
            i++;
            j++;
        }
        return res;
    }
}
