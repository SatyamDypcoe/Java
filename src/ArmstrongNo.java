import java.util.Arrays;

public class ArmstrongNo {
    public static void main(String[] args) {
        int[] arr = { 153, 370, 1634};
        System.out.println(Search(arr));
    }
     static int Search(int[] arr){
//        int n = arr.length - 1;
         for (int i = 0; i < arr.length - 1; i++) {
            int armNo = 0;
             while(i > 0){
                 int lastDigit = i%10;
                 armNo = armNo + (lastDigit * lastDigit * lastDigit);
                 i =  i/10;
             }
             if (i == armNo){
                 return i;
             }
         }
         return -1;
     }
}
