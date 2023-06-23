import java.util.Arrays;

public class prefixSum {
    public static void main(String[] args) {
        int[] arr = { 1,2,3,4,5,6,7,8,9};
        int[] pf = new int[arr.length];
        pf[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            pf[i] =  pf[i-1] + arr[i];
        }
//        System.out.println(Arrays.toString(pf));
    }
}
