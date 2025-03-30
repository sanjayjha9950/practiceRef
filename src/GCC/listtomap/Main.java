package GCC.listtomap;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Integer> numList = Arrays.asList(2,4,5,9,11);
        Map<Integer,Integer> squareMap = numList.stream().collect(Collectors.toMap(num-> num, num->num*num));
        squareMap.entrySet().stream().forEach(System.out::println);
    }
}
