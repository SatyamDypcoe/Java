import java.util.HashMap;
import java.util.HashSet;

public class Lc1207 {
    public static void main(String[] args) {
        int[] arr = {1,2,2,1,1,3};
        System.out.println(uniqueOccurrences(arr));
    }
    public static boolean uniqueOccurrences(int[] arr) {
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        for(int i =0; i < n; i++){
            if(map.containsKey(arr[i])){
                int freq = map.get(arr[i]);
                map.put(arr[i], freq + 1);
            }else{
                map.put(arr[i], 1);
            }
        }
        for(int i: map.values()){
            if(set.contains(i)){
                return false;
            }else{
                set.add(i);
            }
        }
        return true;
    }
}
