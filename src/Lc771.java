public class Lc771 {
    public static void main(String[] args) {
        String stones = "aAAbbbb";
        String jewels = "aA";
        System.out.println(numJewelsInStones(jewels, stones));
    }
    public static int numJewelsInStones(String jewels, String stones) {
        int n = stones.length();
        int m = jewels.length();
        int c = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++ ){
                if(stones.charAt(i) == jewels.charAt(j)){
                    c++;
                }
            }
        }
        return c;
    }
}
