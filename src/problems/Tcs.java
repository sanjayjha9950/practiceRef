package problems;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Tcs {

    public static void main(String args[]){

        Integer[] intArr = {1,3,4,6,7,8,12,13,15,20};
        List<Integer> integerList = Arrays.asList(intArr);

        /*integerList.stream().forEach(integer -> {
            if (integer>2 && integer%2==0)
                System.out.println(integer);
        });*/

        integerList.stream().filter(integer -> integer>2 && integer%2==0).forEach(System.out::println);
    }
}
