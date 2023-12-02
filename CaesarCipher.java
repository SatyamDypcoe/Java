public class CaesarCipher {
    public static void main(String[] args) {
        String s = "abc-defg@hijk-lmnopqrstuvwxyz!";
        int k = 2 ;
        System.out.println(caesarCipher(s, k));
    }
    public static String caesarCipher(String s, int k) {
        // Write your code here
        int n = s.length();
        // System.out.println(n);
        if(k > 26){
            k = k % 26;
        }
        String ans = "";
        for(int i = 0; i < n; i++){
            if((s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')){
                if(s.charAt(i)+ k >= 65 && s.charAt(i)+ k <= 90){
                    ans += (char)(s.charAt(i)+ k);
                }
                else if(s.charAt(i) + k > 90){
                    int d = (s.charAt(i)+ k) - 90;
                    ans += (char)(64 + d);
                }
            }
            else if((s.charAt(i) >= 'a' && s.charAt(i) <= 'z')){
                if(s.charAt(i) + k >= 97 && s.charAt(i)+ k <= 122){
                    ans += (char)(s.charAt(i)+ k);
                }
                else if(s.charAt(i)+ k > 122){
                    int f = (s.charAt(i)+ k) - 122;
                    ans += (char)(96 + f);
                }
            }else{
                ans += s.charAt(i);
            }
        }
        return ans;
    }

}
