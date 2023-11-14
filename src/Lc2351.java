import java.util.HashSet;

public class Lc2351 {
    public static void main(String[] args) {
        String s = "abccbaacz";
        System.out.println(repeatedCharacter(s));
    }
    public static char repeatedCharacter(String s) {
        int n = s.length();
        int index = 0;
        HashSet<Character> set = new HashSet<>();
        for(int i =0; i < n; i++){
            if(set.contains(s.charAt(i))){
                index = i;
                break;
            }else{
                set.add(s.charAt(i));
            }
        }
        return s.charAt(index);
    }
}
