public class AddBinaryString {
    public static void main(String[] args) {
        String A = "110";
        String B = "10";
        System.out.println(addBinary(A, B));
    }
    public static String addBinary(String A, String B) {
        int carry = 0;
        int i = A.length() - 1;
        int j = B.length() - 1;
        String ans = "";
        while(i >= 0 || j >= 0 || carry != 0){
            int sum = 0;
            if(i >= 0){
                sum = sum + (A.charAt(i) - '0');
                i--;
            }
            if(j >= 0){
                sum = sum + (B.charAt(j) - '0');
                j--;
            }
            sum = sum + carry;
            int bit = sum % 2;
            carry = sum / 2;
            ans =(char)(bit + '0') + ans; // dont need to reverse the ans by adding rest value

        }
        return ans;
    }
}
