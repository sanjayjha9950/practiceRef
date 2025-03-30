package GCC.employeedeptstream;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Department hr = new Department(101, "HR");
        Department engineering = new Department(102, "Engineering");
        Department finance = new Department(103, "Finance");

        Employee[] employees = new Employee[10];

        employees[0] = new Employee(1, "John Doe", 75000.00, hr);
        employees[1] = new Employee(2, "Jane Smith", 80000.00, hr);
        employees[2] = new Employee(3, "Alice Johnson", 72000.00, engineering);
        employees[3] = new Employee(4, "Bob Brown", 68000.00, finance);
        employees[4] = new Employee(5, "Charlie Davis", 90000.00, hr);
        employees[5] = new Employee(6, "Dana White", 85000.00, engineering);
        employees[6] = new Employee(7, "Eve Black", 67000.00, finance);
        employees[7] = new Employee(8, "Frank Green", 82000.00, hr);
        employees[8] = new Employee(9, "Grace Lee", 78000.00, engineering);
        employees[9] = new Employee(10, "Hank Miller", 73000.00, finance);
        List<Employee> employeeList = Arrays.asList(employees);
        System.out.println("========================================");
        //Find highest salary from every department from employee list using stream api
        System.out.println("Highest salary in each department");
        employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))))
                .forEach((department, employee) -> System.out.println(department.getDeptName()+": "+employee.get().getEmpName()+": "+employee.get().getSalary()));
        Map<Department, List<Employee>> departmentEmpMap = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment));




        System.out.println("Employee in each department");
        Map<Department,List<Employee>> depEmpMap = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment));
        depEmpMap.entrySet().stream()
                .forEach(departmentListEntry -> System.out.println(
                        departmentListEntry.getKey().getDeptName()+":"+departmentListEntry.getValue().stream().map(Employee::getEmpName).collect(Collectors.toList())));

        //Find distinct department name in list
        System.out.println("========================================");
        System.out.println("Unique departments");
        employeeList.stream().map(e->e.getDepartment().getDeptName()).distinct().forEach(System.out::println);

        //Find number of employee in each department
        System.out.println("========================================");
        System.out.println("Counting employee in each department");
        Map<Department, Long> countPerDept = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));

        countPerDept.forEach((department, count) -> {
            System.out.println(department.getDeptName() + ": " + count);
        });

        System.out.println("========================================");
        double highestSal = employeeList.stream().mapToDouble(Employee::getSalary).max().getAsDouble();
        System.out.println("Highest Salary: "+highestSal);

        Comparator<Employee> empComparator = Comparator.comparing(Employee::getEmpName);
        employeeList.sort(empComparator);
        employeeList.forEach(System.out::println);
    }
}
