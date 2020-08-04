package data.structure.sorting;

public class BubbleSort {

    public static void main(String args[]){
        int[] intArray = {25,-12,78,34,5,26};
        for (int lastUnsortedIndex = intArray.length-1; lastUnsortedIndex >0; lastUnsortedIndex--){
            for(int i =0;i<lastUnsortedIndex;i++){
                if (intArray[i]>intArray[i+1])
                    swap(intArray,i,i+1);
            }
        }
        for (Integer a : intArray)
            System.out.println(a);
    }

    private static void swap(int[] arr, int i, int j){
        if(i==j){
            return;
        }
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
