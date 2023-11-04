public class Lc2810 {
    public static void main(String[] args) {
        String s = "string";
        System.out.println(finalString(s));
    }
    public static String finalString(String s) {
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++){
            if(s.charAt(i) == 'i'){
                sb.reverse();
            }
            else{
                sb.append(s.charAt(i));
            }
        }
        return String.valueOf(sb);
    }
}
