package problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Interview {

    public static void main(String args[]){
        Interview i1 = new Interview();
        //i1.method();
        Person p1 = new Person();
        Person p2 = new Person();
        Person p3 = new Person();


        List<Person> personList = new ArrayList<>();
        personList.add(p1);
        personList.add(p2);
        personList.add(p3);

        Optional<Person> personOp = personList.stream().filter(person-> person.getId()==2).findAny();
        System.out.println(personOp.get());
    }

    static class Person{
        private int id;
        private String name;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static int sum(int a, int b){
        return a+b;
    }

}

 class Interview1 extends Interview{


    public static int sum(int a, int b){
        return a+b;
    }
    public static void main(String args[]){
        Interview1 i2 = new Interview1();
        i2.sum(5,2);
    }
}
