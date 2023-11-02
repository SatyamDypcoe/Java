public class Lc709 {
    public static void main(String[] args) {
        String s = "Hello";
        System.out.println(toLowerCase(s));
    }
    public static String toLowerCase(String s) {
        int n = s.length();
        String ans = "";
        for(int i = 0; i < n; i++){
            if(s.charAt(i) >= 65 && s.charAt(i) <= 90){
                char ch = (char)(s.charAt(i)+32);
                ans += ch;
            }else{
                ans += s.charAt(i);
            }
        }
        return ans;
    }
}
