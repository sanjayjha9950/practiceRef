package GCC.records;

public class Main {



    public static void main(String[] args) {
        record Student(String name,Integer roll){}
        Student student1 = new Student("Gappu",22);
        System.out.println(student1);
    }
}
