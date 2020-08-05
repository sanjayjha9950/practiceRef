package problems.isomorphic;

import java.util.HashMap;
import java.util.Map;

class Solution {

    public static void main(String args[]){
        System.out.println(isIsomorphic("add","egg"));
    }
    public static boolean isIsomorphic(String s, String t) {
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        StringBuilder res = new StringBuilder();
        Map<Character,Character> charMap = new HashMap<>();
        for (int i =0; i<s.length();i++){
            if (charMap.get(sArr[i])==null && charMap.get(tArr[i])==null )
                charMap.put(sArr[i],tArr[i]);
            else if (charMap.get(sArr[i])!=null && charMap.get(sArr[i]).equals(tArr[i]))
                continue;
            else
                return false;

        }
        for (int i=0;i<t.length();i++)
            res.append(charMap.get(sArr[i]));
        return t.equals(res.toString());
    }
}
