public class Lc2798 {
    public static void main(String[] args) {
        int[] hours = {5,1,4,2,2};
        int target = 6;
        System.out.println(numberOfEmployeesWhoMetTarget(hours, target));
    }
    public static int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int n = hours.length;
        int c = 0;
        for(int i = 0; i < n; i++){
            if(hours[i] >= target){
                c++;
            }
        }
        return c;
    }
}
