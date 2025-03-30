package problems;

import java.util.Arrays;

/*3.	Write program
for Input=> {“a","aa","bbb","aabbb","abaababaa"}
Output should be=>{“a1","a2","b3","a2b3","a1b1a2b1a1b1a2"}*/
public class CountCharsStringArray {

    public static void main(String[] args) {
        String[] arr = {"a","aa","bbb","aabbb","abaababaa"};
        for(int i = 0;i<arr.length;i++){
            char[] c = arr[i].toCharArray();
            int count=0;
            StringBuilder newString = new StringBuilder();
            for(int j=0;j<c.length;j++){
                if(j==0 ||c[j]!=c[j-1]){
                    if (count>0) newString.append(count);
                    count=1;
                    newString.append(c[j]);
                }else count++;
            }
            newString.append(count);
            arr[i] = newString.toString();
        }

        System.out.println(Arrays.toString(arr));
    }
}
