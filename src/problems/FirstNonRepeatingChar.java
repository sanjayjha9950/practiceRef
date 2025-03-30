package problems;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

public class FirstNonRepeatingChar {

    public static void main(String[] args) {
        String s = "ababcccdnnk";
        char[] cArr = s.toCharArray();
        LinkedHashMap<Character,Integer> charCountMap = new LinkedHashMap<>();

        for(char c : cArr){
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c)+1);
            }else charCountMap.put(c,1);
        }
        charCountMap.entrySet().forEach(System.out::println);

        Optional<Character> cOps = charCountMap.entrySet().stream().filter(e->e.getValue()==1).map(Map.Entry::getKey).findFirst();
        cOps.ifPresent(System.out::println);
    }
}
