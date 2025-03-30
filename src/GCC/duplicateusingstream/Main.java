package GCC.duplicateusingstream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        List<Integer> numList = Arrays.asList(1,3,5,3,2,9,21,1);
        String s = "abc abc cde cde def";
        String[] sArr =s.split(" ");
        String s1 = "sanjay";
        s1.concat("Jha");
        System.out.println(s1);
        Stream.of(sArr).collect(Collectors.groupingBy(word->word,Collectors.counting())).entrySet().forEach(System.out::println);


        numList.stream()
                .collect(Collectors.groupingBy(num->num,Collectors.counting()))
                .entrySet().stream().filter(e-> e.getValue()>1)
                .forEach(System.out::println);
    }
}
