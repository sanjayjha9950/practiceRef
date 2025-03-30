package GCC.targetelementindex;


//Given an array of integers in ascending order - 1,2,4,5,6
// and there is a target value: 3. You need to find the position
// of the target element in the array if it is present and if it is not
// present find the index of the array in which it is inserted to maintain ascending order.
public class Main {

    public static void main(String[] args) {
        int[] input = {-1,2,4,5,6};
        int target = 5;
        System.out.println(getTargetIndex(input,target));
    }

    private static int getTargetIndex(int[] input, int target) {
        if (input[0]>=target)
            return 0;
        for(int i =0;i<input.length-1;i++){
            if (input[i+1]>=target)
                return i+1;
        }
        return input.length;
    }
}
