package problems;

import java.util.*;

public class Sarathi {

    public static  void main(String args[]){

        String  input = "Elephant";

        char [] cArr = input.toLowerCase().toCharArray();

        List<Character> characterList = new ArrayList<>();
        for (Character c : cArr){
            characterList.add(c);
        }
        Map<Character,Integer> vowels = new HashMap<Character,Integer>();
        vowels.put('a',0);
        vowels.put('e',0);
        vowels.put('i',0);
        vowels.put('o',0);
        vowels.put('u',0);


        int [] frequency = new int[26];

        characterList.stream().forEach(character ->
            {
                if (vowels.get(character)!=null) {
                    int temp = vowels.get(character);
                    vowels.put(character, ++temp);
                }
            });

        for (Map.Entry<Character,Integer> entry : vowels.entrySet()){
            System.out.println(entry.getKey()+" : "+ entry.getValue());
        }

    }

}
