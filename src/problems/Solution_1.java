package problems;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution_1 {


    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int numCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> num = IntStream.range(0, numCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(toList());

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        int result = Result.minSum(num, k);

        //bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();

        bufferedReader.close();
        //bufferedWriter.close();
    }

}

    class Result {

        /*
         * Complete the 'minSum' function below.
         *
         * The function is expected to return an INTEGER.
         * The function accepts following parameters:
         *  1. INTEGER_ARRAY num
         *  2. INTEGER k
         */

        public static int minSum(List<Integer> num, int k) {
            // Write your code here
            int j=0;
            int m=k;
            if (k>num.size()) {
                j = k % num.size();
                m = num.size() - j;
            }
            int maxIndex =0;
            int tot=0;
            for(int i=0;i<m;i++){
                num.set(i, (int)Math.round((double)num.get(i) / 2.0));
            }
            for(int i=0;i<j;i++){
                maxIndex = getMaxIndex(num);
                num.set(maxIndex, Math.round(num.get(i)/2));
            }
            for(int i:num){
                tot+=i;
            }
            System.out.println("Total= "+tot);
            return tot;

        }
        private static int getMaxIndex(List<Integer> num){
            int maxIndex =0;
            int max=0;
            int i=0;
            while(i<num.size()){
                if(num.get(i)>max){
                    max=num.get(i);
                    maxIndex=i;
                }
                i++;
            }
            return maxIndex;
        }

    }


