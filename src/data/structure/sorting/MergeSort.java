package data.structure.sorting;

public class MergeSort {

    public static void main(String args[]){
        int[] intArray = {25,-12,78,34,5,26,21};
        long startTime = System.nanoTime();

        mergeSort(intArray,0,intArray.length);


        long endTime = System.nanoTime();


        for (Integer a : intArray)
            System.out.println(a);

        System.out.println("Time Take = "+(endTime-startTime));
    }

    public static void mergeSort(int[] input, int start, int end){
        if(end-start<2)
            return;

        int mid = (start+end)/2;
        mergeSort(input,start,mid);
        mergeSort(input,mid,end);
        merge(input,start,mid,end);

    }

    public static void merge(int[]input, int start,int mid,int end){

        if(input[mid-1]>=input[mid]){
            return;
        }

        int i =start;
        int j = mid;
        int tempIndex = 0;

        int[]temp = new int [end-start];

        while(i<mid && j< end){
            temp[tempIndex++] = input[i]>=input[j]? input[i++]:input[j++];
        }

        System.arraycopy(input,i,input, start+tempIndex,mid-i);
        System.arraycopy(temp,0,input,start,tempIndex);
    }
}
