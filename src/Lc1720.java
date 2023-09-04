import java.lang.reflect.Array;
import java.util.*;
public class Lc1720 {
    public static void main(String[] args) {
        int[] encoded ={1,2,3};
        int first = 1;
        System.out.println(Arrays.toString( decode(encoded, first)));
    }
    public static int[] decode(int[] encoded, int first) {
        int n = encoded.length;
        int[] ans = new int[n+ 1];
        ans[0] = first;
        for(int i = 0; i < n; i++){
            ans[i+1] = ans[i] ^ encoded[i];
        }
        return ans;
    }
}
