import java.util.HashMap;

public class Lc1528 {
    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};
        System.out.println(restoreString(s, indices));
    }
    public static String restoreString(String s, int[] indices) {
        int n = indices.length;
        int m = s.length();
        HashMap<Integer, Character> map = new HashMap<>();
        String ans = "";
        for(int i = 0; i < n; i++){
            map.put(indices[i], s.charAt(i));
        }
        for(int i = 0; i < n; i++){
            ans = ans + map.get(i);
        }
        return ans;
    }
}
