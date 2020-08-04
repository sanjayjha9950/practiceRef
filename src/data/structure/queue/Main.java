package data.structure.queue;



public class Main {

    public static void main(String args[]){

        Employee janeJones = new Employee(123, "Jane", "Jones");
        Employee johnDoe = new Employee(4567, "John", "Doe");
        Employee mikeWilson = new Employee(1233, "Mike", "Wilson");
        Employee billEnd = new Employee(434,"Bill", "End");

        ArrayQueue queue = new ArrayQueue(5);
        System.out.println("Adding "+queue.add(janeJones).getfName());
        System.out.println("Adding "+queue.add(johnDoe).getfName());
        System.out.println("Removing "+queue.remove().getfName());
        System.out.println("Adding "+queue.add(billEnd).getfName());
        System.out.println("Removing "+queue.remove().getfName());
        System.out.println("Adding "+queue.add(johnDoe).getfName());
        System.out.println("Removing "+queue.remove().getfName());
        System.out.println("Adding "+queue.add(mikeWilson).getfName());
        //queue.printQueue();
        System.out.println("Removing "+queue.remove().getfName());
        System.out.println("Adding " + queue.add(janeJones).getfName());
        //System.out.println("Removing...");
        queue.printQueue();
        //System.out.println("Peeking...");
        //System.out.println(queue.peek());
    }
}
