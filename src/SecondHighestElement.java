public class SecondHighestElement {
    public static void main(String[] args) {
      int[] A = {20,2, 1, 2, 12, 14, 17, 18, 20, 15};
        System.out.println(solve(A));
    }
    static int solve(int[] A) {
        int idx = 0;
        int maxValue = -1;
        int sMax =-1;
        for(int i = 0; i < A.length; i++){
            if(A[i] > maxValue ){
                maxValue = A[i];
                idx = i;
            }
        }
        for(int j = 0; j < A.length; j++){
            if(j != idx && A[j] != maxValue){
                if(A[j] > sMax ){
                    sMax = A[j];
                }
            }
        }
        if(A.length == 1){
            return -1;
        }else{
            return sMax;
        }
    }
}
