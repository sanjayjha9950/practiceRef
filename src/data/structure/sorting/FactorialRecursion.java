package data.structure.sorting;

public class FactorialRecursion {
    public static void main(String args[]){
        System.out.println(fact(6));
    }
    public static int fact(int number){
        if (number==0)
            return 1;

        return number * fact(number-1);


    }

}
