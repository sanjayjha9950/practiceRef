package data.structure.sorting;

public class QuickSort {

    public static void main(String args[]){
        int[] intArray = {25,-12,78,34,5,26,21};
        long startTime = System.nanoTime();

        quickSort(intArray,0,intArray.length);


        long endTime = System.nanoTime();


        for (Integer a : intArray)
            System.out.println(a);

        System.out.println("Time Take = "+(endTime-startTime));
    }

    public static void quickSort(int[] input, int start, int end){
        if(end-start<2){
            return;
        }

        int pivotIndex = partition(input,start,end);
        quickSort(input,start,pivotIndex);
        quickSort(input,pivotIndex+1,end);
    }

    public static int partition(int[] input, int start, int end ){
        int pivot =input[start];
        int i =start;
        int j =end;

        while(i<j){

            while(i<j && input[--j]>pivot);

            if(i<j){
               input[i] = input[j];
            }

            while (i<j && input[++i]<=pivot);
            if (i<j){
                input[j]=input[i];
            }
        }
        input[j] = pivot;
        return j;
    }
}
