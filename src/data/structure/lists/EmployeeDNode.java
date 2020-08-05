package data.structure.lists;

public class EmployeeDNode {

    private Employee employee;
    private EmployeeDNode next;
    private EmployeeDNode previous;

    public EmployeeDNode(Employee employee) {
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public EmployeeDNode getNext() {
        return next;
    }

    public void setNext(EmployeeDNode next) {
        this.next = next;
    }

    public EmployeeDNode getPrevious() {
        return previous;
    }

    public void setPrevious(EmployeeDNode previous) {
        this.previous = previous;
    }

    @Override
    public String toString() {

        return employee.toString();


    }
}
