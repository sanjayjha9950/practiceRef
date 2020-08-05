package data.structure.sorting;

public class InsertionSort {

    public static void main(String args[]){
        int[] intArray = {25,-12,78,34,5,26,21,4,56,34,23,99,1,77};
        long startTime = System.nanoTime();
        /*for (int firstUnsortedIndex = 1; firstUnsortedIndex <intArray.length; firstUnsortedIndex++){
            int current = intArray[firstUnsortedIndex];
            int i;
            for(i =firstUnsortedIndex;i>0 && intArray[i-1]> current;i--){
                intArray[i] = intArray[i-1];
            }
            intArray[i]=current;

        }*/

        recursiveInsertion(intArray,intArray.length-1);
        long endTime = System.nanoTime();
        for (Integer a : intArray)
            System.out.println(a);

        System.out.println("Time Take = "+(endTime-startTime));
    }

    public static void recursiveInsertion(int[] input, int firstUnsortedIndex){
        if (firstUnsortedIndex ==0){
            return;
        }
        int current = input[firstUnsortedIndex];
        recursiveInsertion(input,--firstUnsortedIndex);
        merge(input,current,firstUnsortedIndex+1);
    }
    public static void merge(int[] input,int current,int firstUnsortedIndex){
        int i;
        for(i = firstUnsortedIndex;i>0 && input[i-1]> current;i--){
            input[i] = input[i-1];
        }
        input[i]=current;
    }


}
