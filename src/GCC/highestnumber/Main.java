package GCC.highestnumber;

public class Main {

    public static void main(String[] args) {
        int[] arr = {9,1,33,21,11,19,4,45};
        int max = arr[0];
        for(int i =1;i<arr.length;i++){
            if (arr[i]>max) max=arr[i];
        }
        System.out.println(max);
    }
}
