package GCC.pairwithsum;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Map<Integer,Integer> numIndexMap = new HashMap<>();
        int[] input = {1,3,8,5,-1,2,7,9};
        int sum = 7;
        Map<Integer,Integer> seen = new HashMap<>();
        for(int j = 0;j<input.length;j++){
            if (seen.containsKey(sum-input[j])){
                System.out.println(j+","+seen.get(sum-input[j]));
            }else{
                seen.put(input[j],j);
            }
        }
        /*for(int i = 0;i<input.length;i++){
            numIndexMap.put(input[i],i);
        }
        for(int i = 0;i<input.length;i++){
            if (numIndexMap.get(sum-input[i])!=null && i<numIndexMap.get(sum-input[i])){
                System.out.println(i+","+numIndexMap.get(sum-input[i]));
            }
        }*/
    }
}
