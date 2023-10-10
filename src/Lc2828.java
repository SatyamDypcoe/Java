import java.util.ArrayList;
import java.util.List;

public class Lc2828 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<String>();;
        String s = "abc";
        words.add("alice");
        words.add("bob");
        words.add("charlie");
        System.out.println(isAcronym(words, s));
    }
    public static boolean isAcronym(List<String> words, String s) {
        int n = words.size();
        int m = s.length();
        if(n != m){
            return false;
        }
        for(int i = 0; i < n; i++){
            String ch = words.get(i);
            if(ch.charAt(0) != s.charAt(i)){
                return false;
            }
        }
        return true;
    }
}
