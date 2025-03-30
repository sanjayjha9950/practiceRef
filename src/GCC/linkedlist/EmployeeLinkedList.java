package GCC.linkedlist;

public class EmployeeLinkedList {

    private EmployeeNode head;


    public void addToFront(Employee employee){
        EmployeeNode employeeNode = new EmployeeNode(employee);
        employeeNode.setNext(head);
        head = employeeNode;
    }


    public void removeFromFront(){
        EmployeeNode current = head;
        head=current.getNext();
    }

    public void printList(){

        EmployeeNode current = head;
        System.out.print("HEAD -> ");

        while (current !=null){
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }


}
