package GCC.ReverseString;

public class Main {

    public static void main(String args[]){
        String s = reverseStringRecursively("Sanjay");
        System.out.println(s);
    }

    private static String reverseStringRecursively(String input) {

        System.out.println(input);
        if (input.isEmpty()){
            System.out.println(input);
            return input;
        }else {
            System.out.println(input.substring(1)+input.charAt(0));
            return reverseStringRecursively(input.substring(1)) + input.charAt(0);

        }
    }
}
