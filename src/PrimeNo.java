public class PrimeNo {
    public static void main(String[] args) {
        int n = 999563;
        System.out.println(checkPrime(n));
    }
    static  int checkPrime(int n){
        int c = 0;
        for (int i = 1; i*i <= n ; i++) {
            if(n%i == 0){
                if(i == n/i){
                    c++;
                }else{
                   c = c+2;
                }
            }
        }
        if(c == 2){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        return 0;
    }
}
