package GCC.segregatezeroone;

import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        int arr[] = {0,1,0,0,1,1,1,0,0,1};
        segregateZeroOne(arr);
        for (Integer num : arr){
            System.out.print(num+",");
        }

    }

    private static void segregateZeroOne(int[] arr) {
        int left = 0;
        int right = arr.length-1;
        while (left<right){

            while (right == 1){
                right++;
            }
            while (left == 0){
                left++;
            }

            if (left<right){
                arr[left]=0;
                arr[right]=1;
                left++;
                right--;
            }
        }
    }
}
