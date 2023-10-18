import java.util.HashMap;

public class FirstRepeatingElement {
    public static void main(String[] args) {
        int[] A = {10, 5, 3, 4, 3, 5, 6};
        System.out.println(solve(A));
    }
    public static int solve(int[] A) {
        int n = A.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            if(map.containsKey(A[i])){
                int freq = map.get(A[i]);
                map.put(A[i], freq + 1);
            }else{
                map.put(A[i], 1);
            }
        }
        for(int j =0; j< n; j++){
            if(map.get(A[j]) > 1){
                return A[j];
            }
        }
        return -1;
    }
}
