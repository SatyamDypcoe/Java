//For the first test case A = 4, the answer is "NO" as sum of its proper divisors = 1 + 2 = 3, is not equal to 4.
//For the second test case A = 6, the answer is "YES" as sum of its proper divisors = 1 + 2 + 3 = 6, is equal to 6

public class PerfectNumber {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(checkNo(n));
    }
    static int checkNo(int n){
        int c = 0;
        for (int i = 1; i < n ; i++) {
            if(n % i == 0){
                c = c + i;
            }
        }
        if( c == n){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        return 0;
    }
}
