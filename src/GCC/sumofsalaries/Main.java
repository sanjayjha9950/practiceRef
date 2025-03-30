package GCC.sumofsalaries;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String args[]){
        Employee e1 = new Employee(1,"Harry",20000.00);
        Employee e2 = new Employee(1,"Ron",25000.00);
        Employee e3 = new Employee(1,"Hermoine",18000.00);

        List<Employee> employeeList = Arrays.asList(e1,e2,e3);
        Double total = employeeList.stream().mapToDouble(e->e.getSalary()).sum();
        System.out.println("Total salary : "+total);

    }
}

class Employee{
    int id;
    String name;
    Double salary;

    public Employee(int id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

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

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
