package leetCode;

/*There are n soldiers standing in a line. Each soldier is assigned a unique rating value.

You have to form a team of 3 soldiers amongst them under the following rules:

Choose 3 soldiers with index (i, j, k) with rating (rating[i], rating[j], rating[k]).
A team is valid if: (rating[i] < rating[j] < rating[k]) or (rating[i] > rating[j] > rating[k]) where (0 <= i < j < k < n).
Return the number of teams you can form given the conditions. (soldiers can be part of multiple teams).



Example 1:

Input: rating = [2,5,3,4,1]
Output: 3
Explanation: We can form three teams given the conditions. (2,3,4), (5,4,1), (5,3,1).
Example 2:

Input: rating = [2,1,3]
Output: 0
Explanation: We can't form any team given the conditions.
Example 3:

Input: rating = [1,2,3,4]
Output: 4*/

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SoldierRatingTeam {

    public static int[] main2(String[] args) {
        int[] input = {2,5,3,4,1};
        System.out.println(numTeams(input));
        List<Integer> squares = Arrays.stream(input).map(n->n*n).sorted().boxed().toList();
        return null;
        //List<Integer> list = Stream.of(input).sorted().collect(Collectors.toList());
    }

    public static int numTeams(int[] rating) {

        int count =0;
        /*for(int i =0;i<rating.length-2;i++){
            for(int j=i+1;j<rating.length-1;j++){
                for(int k =j+1;k<rating.length;k++){
                    if((rating[k]<rating[j] && rating[j]<rating[i])
                            ||(rating[k]>rating[j]&& rating[j]>rating[i])) count ++;
                }
            }
        }*/



        //Map<Integer,Integer> seen = new HashSet<>();

        for(int i =2;i<rating.length;i++){
            Map<Integer,Integer> lowerNumberMap = findLower(rating,i-1,rating[i]);
            if(lowerNumberMap.size()>1){
                count =count+lowerNumberMap.size();
            }

            Map<Integer,Integer> higherNumberMap = findHigher(rating,i-1,rating[i]);
            if(higherNumberMap.size()>1){
                count = count + higherNumberMap.size();
            }
        }

        return count;
    }
    private static Map findLower(int[] rating, int index,int num){
        Map<Integer,Integer> valueIndexMap = new HashMap<>();
        for(int i=index;i>=0;i--){
            if(rating[i]<num) valueIndexMap.put(rating[i],i);
        }
        return valueIndexMap;
    }
    private static Map findHigher(int[] rating, int index,int num){
        Map<Integer,Integer> valueIndexMap = new HashMap<>();
        for(int i=index;i>=0;i--){
            if(rating[i]>num) valueIndexMap.put(rating[i],i);
        }
        return valueIndexMap;
    }
}
