package GCC.startswithone;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> numList = Arrays.asList(123,11,23,34,14,56,71,12);

        numList.stream().filter(n->n.toString().startsWith("1"))
                .forEach(System.out::println);
    }
}
