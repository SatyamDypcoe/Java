public class lc1108 {
    public static void main(String[] args) {
        String address = "255.100.50.0";
        System.out.println(defangIPaddr(address));
    }
    public static String defangIPaddr(String address) {
        int n = address.length();
        String ans = "";
        for(int i =0; i < n; i++){
            if(address.charAt(i) == '.'){
                ans = ans + "[.]";
            }else ans = ans + address.charAt(i);
        }
        return ans;
    }
}
