import java.lang.*;
import java.util.*;

public class ReverseStringRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        reverse(s,n);
    }
    public static void reverse(String s, int n){
        if(n == 0){
            return;
        }
        System.out.print(s.charAt(n-1));
        reverse(s, n-1);
    }
}
