package problems;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

enum Name{
    Alice, Smith
}

public class HackerEarth {

    int val =10;
    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();
        //System.out.print(name);
        List<String> tokens = new ArrayList<>();
        String[] strArr = name.split(" ");
        StringBuilder sd = new StringBuilder();
        for(String temp : strArr){
            if(temp.charAt(0)=='"' || !sd.equals("")){
                sd.append(temp).append(" ");
                if (temp.charAt(temp.length()-1)=='"'){
                    tokens.add(sd.toString());
                    sd=new StringBuilder("");
                }
            }else {
                tokens.add(temp);
            }
        }

        for (String str : tokens){
            System.out.println(str);
        }
    }
}
