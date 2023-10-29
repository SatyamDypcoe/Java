public class Lc2114 {
    public static void main(String[] args) {
        String [] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        System.out.println(mostWordsFound(sentences));
    }
    public static int mostWordsFound(String[] sentences) {
        int n = sentences.length;
        int ans = 0;
        for(int i = 0; i < n; i++){
            int len = sentences[i].split(" ").length;
            ans = Math.max(len, ans);
        }
        return ans;
    }
}
