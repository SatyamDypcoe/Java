public class Lc1221 {
    public static void main(String[] args) {
        String s = "RLRRRLLRLL";
        System.out.println(balancedStringSplit(s));
    }
    public static int balancedStringSplit(String s) {
        int n = s.length();
        int r = 0;
        int l = 0;
        int c = 0;
        for(int i = 0; i < n; i++){
            if(s.charAt(i) == 'R'){
                r++;
            }
            if(s.charAt(i) == 'L'){
                l++;
            }
            if(r == l){
                c++;
            }
        }
        return c;
    }
}
