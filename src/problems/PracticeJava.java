package problems;

public class PracticeJava {

    static int a;

    public static void main(String args[]){
        //Reverse a string
        String str = "SONU";
        System.out.println(reverse(str));
        System.out.println(reverseIteration(str));

        //Palindrome Integer
        Integer test = 1002;
        System.out.println(test.toString().equals(reverse(test.toString())));
        PracticeJava practiceJava = new PracticeJava();

        practiceJava.method();
        System.out.println(a);
    }

    private static String reverse(String input){
        if (input ==null || input.isEmpty()){
            return input;
        }
        return input.charAt(input.length()-1)
                +reverse(input.substring(0,input.length()-1));
    }

    private static String reverseIteration(String input){
        StringBuilder sb = new StringBuilder();
        for (int i=input.length()-1;i>=0;i--){
            sb.append(input.charAt(i));
        }
        return sb.toString();
    }

    public void method(){
        this.a=10;
    }


}
