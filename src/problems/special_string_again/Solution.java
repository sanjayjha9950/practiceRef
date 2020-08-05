/*A string is said to be a special string if either of two conditions is met:

    All of the characters are the same, e.g. aaa.
    All characters except the middle one are the same, e.g. aadaa.
    A special substring is any substring of a string which meets one of those criteria.
    Given a string, determine how many special substrings can be formed from it.

*/

package problems.special_string_again;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the substrCount function below.
    static int i;
    static {
        i=10;
    }

    static void mixup(){
        Object o = new Object();
        Set s = new HashSet();
        s.add("o");
        s.add(o);
    }
    class MyThread extends  Thread{
        public void run(){

        }
        public void run(String s){

        }
    }
    static long substrCount(int n, String s) {
        int count =n;
        char[] charArr = s.toCharArray();
        List<String> specialString = new ArrayList<>();
        for(int strtIdx=0;strtIdx<charArr.length-1;strtIdx++){
            for(int endIdx=strtIdx+2;endIdx<=charArr.length;endIdx++){
                if(isSpecialString(s.substring(strtIdx,endIdx))) {
                    count++;
                    specialString.add(s.substring(strtIdx,endIdx));
                }
            }
        }
        System.out.println(count);
        for (int i =0; i<specialString.size();i++){
            System.out.print(specialString.get(i)+", ");
        }
        return count;
    }

    private static boolean isSpecialString(String s){

        /*int len = s.length();
        int mid =len/2;
        if (len%2!=0)
            return  (s.substring(0,mid).equals(s.substring(mid+1,len)));
        else {
            StringBuilder rhs = new StringBuilder(s.substring(mid,len));
            return (s.substring(0, mid).equals(rhs.reverse().toString()));
        }*/

        StringBuilder reverseString = new StringBuilder(s);
        return s.equals(reverseString.reverse().toString());
    }

    private static final Scanner scanner = new Scanner(System.in);

    /*public static void main(String[] args) throws IOException {

        //long result = substrCount(4, "abcbaba");
        //System.out.println(getHint("11","01"));

    }*/

    public static String getHint(String secret, String guess) {
        int a=0;
        int b=0;
        //Map<Character,Integer> secretMap = new HashMap<>();
        List<Character> guessList = new ArrayList<>();
        List<Character> secretList = new ArrayList<>();
        for (int i = 0;i<guess.length();i++){
            guessList.add(guess.charAt(i));
            secretList.add(secret.charAt(i));
        }

        for(int i =0; i<secret.length();i++){
            if(guess.charAt(i)==secret.charAt(i)) {
                a++;
                guessList.set(i,null);
                secretList.set(i,null);
            }

        }
        for (int i =0;i<secretList.size();i++){
            if (secretList.get(i)!=null && guessList.contains(secretList.get(i))) {
                b++;
                guessList.remove(secretList.get(i));
            }
        }


        return (a+"A"+b+"B");
    }
}

