public class Lc04 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};
        System.out.println(String.format("%.5f",findMedianSortedArrays(nums1, nums2)));
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int q = n+m;
        Double sum = 0d;
        int[] ans = new int[q];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < n && j < m){
            if(nums1[i] < nums2[j]){
                ans[k] = nums1[i];
                i++;
                k++;
            }
            else{
                ans[k] = nums2[j];
                j++;
                k++;
            }
        }
        while(i < n){
            ans[k] = nums1[i];
            i++;
            k++;
        }
        while(j < m){
            ans[k] = nums2[j];
            j++;
            k++;
        }
        if(q % 2 == 0){
            sum = sum + ans[q/2] + ans[(q/2)-1];
            sum = sum/2;
            return sum;
        }
        else{
            return ans[q/2];
        }
    }
}
