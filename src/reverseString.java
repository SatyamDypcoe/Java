import java.util.*;
public class reverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next().toLowerCase();
        String B ="";
        for (int i = 0; i < A.length(); i++) {
            if(A.charAt(i) == 'a' || A.charAt(i) == 'e' || A.charAt(i) =='i'|| A.charAt(i) =='o'||A.charAt(i) =='u'){
                B = B + A.charAt(i);
            }

        }
        System.out.println(B);
    }
}
