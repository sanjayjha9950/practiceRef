package GCC.reversearray;

import java.util.Arrays;

public class Main {

    public static void main(String args[]) {
        Integer[] input = new Integer[]{1, 2, 3, 4, 5, 6};
        Integer[] res = reverseArray(1, 4, input);
        Arrays.stream(res).forEach(System.out::print);
    }

    private static Integer[] reverseArray(int start, int end, Integer[] input) {

        Integer[] reversedArr = new Integer[input.length];
        if (start>end){
            return input;
        }
        for(int i = 0;i<input.length;i++){
            if (i<start || i >end){
                reversedArr[i]=input[i];
            }
        }
        for(int i =start;i<=end;i++){
            if(start<end){
                int temp = input[i];
                reversedArr[i]= input[end];
                reversedArr[end]=temp;
                start++;
                end--;
            }
        }
        return reversedArr;
    }
}
