//
public class LittlePony {
    public static void main(String[] args) {
        int[] A = {2, 4, 3, 1, 5};
        int B = 3;
        System.out.println(solve(A, B));
    }
    public static int solve(int[] A, int B) {
        int n = A.length;
        int flag = 0;
        int c = 0;
        for(int i = 0; i < n; i++){
            if(A[i] == B){
                flag = 1;
            }
            if(A[i] > B){
                c++;
            }
        }
        if(flag == 1){
            return c;
        }
        return -1;
    }
}
