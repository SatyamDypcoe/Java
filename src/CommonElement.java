//First argument is an integer array A of size N.
//
//Second argument is an integer array B of size M.
//
//
//
//Output Format
//Return an integer array denoting the common elements.
//
//
//
//Example Input
//Input 1:
//
// A = [1, 2, 2, 1]
// B = [2, 3, 1, 2]
//Input 2:
//
// A = [2, 1, 4, 10]
// B = [3, 6, 2, 10, 10]
//
//
//Example Output
//Output 1:
//
// [1, 2, 2]
//Output 2:
//
// [2, 10]
//
//
//Example Explanation
//Explanation 1:
//
// Elements (1, 2, 2) appears in both the array. Note 2 appears twice in both the array.
//Explantion 2:
//
// Elements (2, 10) appears in both the array.
import java.util.ArrayList;
import java.util.HashMap;

public class CommonElement {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<Integer>();
        A.add(1);
        A.add(2);
        A.add(2);
        A.add(1);
        ArrayList<Integer> B = new ArrayList<Integer>();
        B.add(2);
        B.add(3);
        B.add(1);
        B.add(2);
        System.out.println(solve(A,B));
    }
    public static ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        // Just write your code below to complete the function. Required input is available to you as the function arguments.
        // Do not print the result or any output. Just return the result via this function.
        int n = A.size();
        int m = B.size();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            if(map.containsKey(A.get(i))){
                int freq = map.get(A.get(i));
                map.put(A.get(i), freq + 1);
            }else{
                map.put(A.get(i), 1);
            }

        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int j = 0; j < m; j++){
            if(map.containsKey(B.get(j)) && map.get(B.get(j)) != 0){
                ans.add(B.get(j));
                int freq = map.get(B.get(j));
                map.put(B.get(j), freq - 1);
            }
        }
        return ans;
    }
}
