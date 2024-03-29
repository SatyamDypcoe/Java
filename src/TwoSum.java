//Given an array of integers, find two numbers such that they add up to a specific target number.
//
//The function twoSum should return indices of the two numbers such that they add up to the target, where index1 < index2. Please note that your returned answers (both index1 and index2 ) are not zero-based. Put both these numbers in order in an array and return the array from your function ( Looking at the function signature will make things clearer ). Note that, if no pair exists, return empty list.
//
//If multiple solutions exist, output the one where index2 is minimum. If there are multiple solutions with the minimum index2, choose the one with minimum index1 out of them.
//
//Input: [2, 7, 11, 15], target=9
//Output: index1 = 1, index2 = 2
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TwoSum {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
        A.add(2);
        A.add(7);
        A.add(11);
        A.add(15);
        int B = 9;
        System.out.println(twoSum(A, B));
    }
    public static ArrayList<Integer> twoSum(final List<Integer> A, int B) {
        int n = A.size();
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i < n; i++){
            int a = A.get(i);
            int b = B - a;
            if(map.containsKey(b)){
                ans.add(map.get(b));
                ans.add(i +1);
                return ans;
            }
            else if(map.containsKey(A.get(i))){
                continue;
            }
            else{
                map.put(A.get(i), i+1);
            }
        }
        return ans;
    }
}
