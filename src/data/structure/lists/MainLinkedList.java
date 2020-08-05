package data.structure.lists;

public class MainLinkedList {

    public static void main(String args[]){

        Employee janeJones = new Employee(123, "Jane", "Jones");
        Employee johnDoe = new Employee(4567, "John", "Doe");
        Employee mikeWilson = new Employee(1233, "Mike", "Wilson");

        EmployeeLinkedList employeeLinkedList = new EmployeeLinkedList();
        EmployeeDoublyLinkedList employeeDoublyLinkedList = new EmployeeDoublyLinkedList();

        System.out.println("Adding employees to front");
        employeeLinkedList.addToFront(janeJones);
        employeeLinkedList.addToFront(johnDoe);
        employeeLinkedList.printList();

        System.out.println("Removing from front");
        employeeLinkedList.removeFromFront();
        employeeLinkedList.printList();

        System.out.println("========= Doubly Linked List =========");
        System.out.println();
        System.out.println("Adding employee to Front");

        employeeDoublyLinkedList.addToFront(janeJones);
        employeeDoublyLinkedList.addToFront(johnDoe);
        employeeDoublyLinkedList.printList();
        System.out.println(employeeDoublyLinkedList.getSize());
        System.out.println("Adding Employee to end");
        employeeDoublyLinkedList.addToEnd(mikeWilson);
        employeeDoublyLinkedList.printList();
        System.out.println(employeeDoublyLinkedList.getSize());

        employeeDoublyLinkedList.removeFromFront();
        System.out.println("Removing from front");
        employeeDoublyLinkedList.printList();
        System.out.println(employeeDoublyLinkedList.getSize());

        employeeDoublyLinkedList.removeFromEnd();
        System.out.println("Removing from end");
        employeeDoublyLinkedList.printList();
        System.out.println(employeeDoublyLinkedList.getSize());


    }
}
