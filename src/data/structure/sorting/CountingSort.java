package data.structure.sorting;

public class CountingSort {

    public static void main(String args[]){
        int[] intArray = {5,2,4,7,3,1,8};
        long startTime = System.nanoTime();

        countingSort(intArray,1,8);


        long endTime = System.nanoTime();


        for (Integer a : intArray)
            System.out.println(a);

        System.out.println("Time Take = "+(endTime-startTime));
    }

    public static void countingSort(int[] input, int min , int max) {
        int [] countArray = new int[(max - min) + 1];

        for (int i = min; i < input.length; i++){
            countArray[input[i] - min]++;
        }

        int j =0;

         for (int i = min; i<=max; i++) {
             while (countArray[i - min] > 0) {
                 input[j++] = i;
                 countArray[i-min]--;
             }
         }
    }
}
