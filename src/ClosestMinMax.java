//Problem Description
//Given an array A, find the size of the smallest sub-array such that it contains at least one occurrence of the maximum value of the array
//and at least one occurrence of the minimum value of the array.
//Output Format:-
//Return the length of the smallest subarray which has at least one occurrence of minimum and maximum element of the array
//Example Input
//Input 1:
//A = [1, 3, 2]
//Input 2:
//A = [2, 6, 1, 6, 9]
//Output 1:
// 2
//Output 2:
// 3
public class ClosestMinMax {
    public static void main(String[] args) {
        int[] A = {2, 6, 1, 6, 9};
        System.out.println(solve(A));
    }
    public static int solve(int[] A) {
        int n = A.length;
        int maxVal = Integer.MIN_VALUE;
        int minVal = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            if(A[i] < minVal){
                minVal = A[i];
            }
            if(A[i] > maxVal){
                maxVal = A[i];
            }
        }
        if(maxVal == minVal){
            return 1;
        }
        int len = Integer.MAX_VALUE;
        int ans = n;
        int min_i = -1;
        int max_i = -1;
        for(int i = n-1; i>= 0; i--){
            if(A[i] == minVal){
                min_i = i;
                if(max_i != -1){
                    len = max_i - min_i +1;
                    ans = Math.min(len, ans);
                }
            }
            else if(A[i] == maxVal){
                max_i = i;
                if(min_i != -1){
                    len = min_i - max_i + 1;
                    ans = Math.min(len, ans);
                }
            }
        }
        return ans;
    }
}
