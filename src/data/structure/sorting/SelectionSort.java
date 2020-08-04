package data.structure.sorting;

public class SelectionSort {

    public static void main(String args[]){
        int[] intArray = {25,-12,78,34,5,26};
        for (int lastUnsortedIndex = intArray.length-1; lastUnsortedIndex >0; lastUnsortedIndex--){
            int largest =0;
            for(int i =1;i<=lastUnsortedIndex;i++){
                if (intArray[i]>intArray[largest]) {
                    largest=i;
                }
                swap(intArray, largest, lastUnsortedIndex);
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
