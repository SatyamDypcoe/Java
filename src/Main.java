import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] arr= {-10,-5,-50,-1, 15};

        int max = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
                if(arr[i]> max)
                    max = arr[i];
        }
        System.out.println(max);
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    static void reverse(int[] arr){
       int  start = 0;
        int end = arr.length-1;
        while(start< end){
            swap(arr, start,end);
            start++;
            end --;
        }
    }
    }


