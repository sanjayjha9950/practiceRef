package data.structure.lists;

public class EmployeeDoublyLinkedList {

    private EmployeeDNode head;
    private EmployeeDNode tail;
    private int size;

    public void addToFront(Employee employee){
        EmployeeDNode node = new EmployeeDNode(employee);
        node.setNext(head);
        if (head == null) // for empty list
            tail = node;
        else
            head.setPrevious(node);

        head = node;
        size++;

    }

    public void addToEnd(Employee employee){
        EmployeeDNode node = new EmployeeDNode(employee);
        if (tail==null)
            head= node;
        else {
            tail.setNext(node);
            node.setPrevious(tail);
        }
        tail=node;
        size++;

    }

    public void removeFromFront(){
        if (head==null)
            return;
        else if (tail==null) {
            head = null;
            return;
        }
        else {
            head.getNext().setPrevious(null);
        }
        head = head.getNext();
        size--;
    }

    public void removeFromEnd(){
        if (head==null)
            return;
        else if (tail==null){
            head = null;
            return;
        }else {
            tail.getPrevious().setNext(null);
        }
        tail =tail.getPrevious();
        size--;
    }

    public EmployeeDNode getHead() {
        return head;
    }

    public void setHead(EmployeeDNode head) {
        this.head = head;
    }

    public EmployeeDNode getTail() {
        return tail;
    }

    public void setTail(EmployeeDNode tail) {
        this.tail = tail;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void printList(){
        EmployeeDNode current = head;
        System.out.print("HEAD -> ");

        while (current !=null){
            System.out.print(current);
            System.out.print(" <=> ");
            current = current.getNext();
        }
        System.out.println("null");
    }
}
