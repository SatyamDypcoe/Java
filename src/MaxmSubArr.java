//You are given an integer array C of size A. Now you need to find a subarray (contiguous elements) so that the sum of contiguous elements is maximum.
//But the sum must not exceed B.
//Example Input
//Input 1:
//A = 5
//B = 12
//C = [2, 1, 3, 4, 5]
//Input 2:
//A = 3
//B = 1
//C = [2, 2, 2]
//Output 1:
//        12
//        Output 2:
//        0
//Explanation 1:
//        We can select {3,4,5} which sums up to 12 which is the maximum possible sum.
//        Explanation 2:
//        All elements are greater than B, which means we cannot select any subarray.
//        Hence, the answer is 0.
public class MaxmSubArr {
    public static void main(String[] args) {
        int[] C = {2, 1, 3, 4, 5};
        int A = 5 ;
        int B = 12 ;
        System.out.println(maxSubarray(A,B,C));
    }
    public static int maxSubarray(int A, int B, int[] C) {
        int maxV = 0;
        for(int i =0; i< A; i++){
            int sum = 0;
            for(int j = i; j < A; j++){
                sum = sum + C[j];
                if(sum <= B && sum > maxV ){
                    maxV = sum;
                }
            }
        }
        return maxV;
    }
}
