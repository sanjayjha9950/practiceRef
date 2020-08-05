package data.structure.sorting;

public class ShellSort {

    public static void main(String args[]){
        int[] intArray = {25,-12,78,34,5,26,21,4,56,34,23,99,1,77};
        long startTime = System.nanoTime();
        for (int gap =intArray.length/2; gap>0; gap/=2){
            for (int i =gap; i<intArray.length;i++){
                int newElement =intArray[i];

                int j =i;
                while ((j>=gap && intArray[j-gap]> newElement)){
                    intArray[j] = intArray[j-gap];
                    j-=gap;
                }
                intArray[j] = newElement;
            }
        }
        long endTime = System.nanoTime();


        for (Integer a : intArray)
            System.out.println(a);

        System.out.println("Time Take = "+(endTime-startTime));
    }
}
