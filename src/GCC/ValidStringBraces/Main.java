package GCC.ValidStringBraces;

import java.io.IOException;
import java.util.Stack;

public class Main {

    public static void main(String args[]) throws IOException {
        boolean res = getCharacters("}}");
        System.out.println(res);
    }

    private static boolean getCharacters(String input) {
        Stack<Character> s = new Stack<>();
        char[] cArr = input.toCharArray();
        for (char c : cArr){
            if (c == '{') s.push(c);
            if (c == '}')
            {
                if (s.size()==0) {
                    return false;
                }
                if(s.pop()==null) return false;

            }
        }
        return s.size()==0;
    }
}
