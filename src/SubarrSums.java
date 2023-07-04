//You are given an integer array A of length N.
//You have to find the sum of all subarray sums of A.
//More formally, a subarray is defined as a contiguous part of an array which we can obtain by deleting zero or more elements from either end of the array.
//A subarray sum denotes the sum of all the elements of that subarray.
//Note : Be careful of integer overflow issues while calculations. Use appropriate datatypes.
//Example Input
//Input 1:
//A = [1, 2, 3]
//Input 2:
//A = [2, 1, 3]
//Example Output
//Output 1:
//20
//Output 2:
//19
//Explanation 1:
//        The different subarrays for the given array are: [1], [2], [3], [1, 2], [2, 3], [1, 2, 3].
//        Their sums are: 1 + 2 + 3 + 3 + 5 + 6 = 20
//        Explanation 2:
//        The different subarrays for the given array are: [2], [1], [3], [2, 1], [1, 3], [2, 1, 3].
//        Their sums are: 2 + 1 + 3 + 3 + 4 + 6 = 19
public class SubarrSums {
    public static void main(String[] args) {
        int[] A = {2, 1, 3};
        System.out.println(subarraySum(A));
    }
    public static long subarraySum(int[] A) {
        int n = A.length;
        long totalSum = 0;
        for(int i =0; i< n; i++){
            long l = i +1;
            long r = n - i;
            long c = l*r;
            totalSum = totalSum + (c * A[i]);
        }
        return totalSum;
    }
}
