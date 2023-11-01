public class Lc1689 {
    public static void main(String[] args) {
        String n = "82734";
        System.out.println(minPartitions(n));
    }
    public static int minPartitions(String n) {
        int m = n.length();
        int ans  = 0;
        for(int i = 0; i < m; i++){
            int j = n.charAt(i) - '0';
            ans = Math.max(j, ans);
        }
        return ans;
    }
}
