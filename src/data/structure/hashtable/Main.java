package data.structure.hashtable;




public class Main {

    public static void main(String args[]){

        Employee janeJones = new Employee(123, "Jane", "Jones");
        Employee johnDoe = new Employee(4567, "John", "Doe");
        Employee mikeWilson = new Employee(1233, "Mike", "Wilson");
        Employee billEnd = new Employee(434,"Bill", "End");
        Employee marySmith = new Employee(12342,"Mary","Smith");

        SimpleHashTable ht = new SimpleHashTable();
        ht.put("Jones", janeJones);
        ht.put("Doe", johnDoe);
        ht.put("Wilson",mikeWilson);
        ht.put("Smith",marySmith);

        ht.remove("Wilson");
        ht.remove("Jones");
        //ht.put("Jones",janeJones);

        //ht.printHashtable();

        //System.out.println("Retrive key Smith: "+ ht.get("Smith"));


        //Chained Hash Table
        ChainedHashTable cht = new ChainedHashTable();
        cht.put("Jones", janeJones);
        cht.put("Doe", johnDoe);
        cht.put("Wilson",mikeWilson);
        cht.put("Smith",marySmith);

        cht.remove("Wilson");
        //cht.remove("Jones");
        //ht.put("Jones",janeJones);

        cht.printHashTable();

        System.out.println("Retrive key Smith: "+ ht.get("Smith"));

    }
}
