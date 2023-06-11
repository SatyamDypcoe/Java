public class SearchInMatrices {
    public static void main(String[] args) {
        int[][] arr = {{18, 9, 12}, {36, -4, 91}, {44, 33, 16}};
        int target = 91;
        int[] ans = SearchInMat(arr, target);
        int value = Value(arr, target);
        System.out.println("index: " + ans[0] + " " + ans[1]);
        System.out.println("Value: " +value);
    }

    static int[] SearchInMat(int[][] arr, int target) {
        int n = arr.length;
        int[] ans = new int[2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == target) {
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }
            }

        }
        ans[0] = -1;
        ans[1] = -1;
        return ans;
    }

    static int Value(int[][] arr, int target) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == target) {

                    return arr[i][j];
                }
            }

        }
        return -1;
    }
}