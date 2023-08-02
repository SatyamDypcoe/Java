import java.util.Arrays;

public class Lc66 {
    public static void main(String[] args) {
        int[] digits = {9, 9, 9};
        System.out.println(Arrays.toString(plusOne(digits)));
    }
    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        int[] ans = new int[n+1];
        for(int i = n-1; i >= 0; i--){
            if(digits[i] != 9){
                digits[i]++;
                break;
            }else{
                digits[i] = 0;
            }
            if(digits[0]== 0){
                ans[0] = 1;
                return ans;
            }
        }
        return digits;
    }
}
