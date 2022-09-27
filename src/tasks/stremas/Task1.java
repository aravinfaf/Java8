package tasks.stremas;

import util.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(101,"aravind",101,"active",2000));
        employeeList.add(new Employee(102,"santhiya",101,"active",3000));
        employeeList.add(new Employee(103,"ragul",102,"active",7000));
        employeeList.add(new Employee(104,"roopa",102,"inactive",4000));
        employeeList.add(new Employee(105,"puppy",101,"active",6000));
        employeeList.add(new Employee(106,"arun",102,"inactive",3000));

        //Employee details based on dept
        Map<Integer,List<Employee>> empDept = employeeList.stream().collect(Collectors.groupingBy(employee -> employee.getDeptId(),
                Collectors.toList()));

        for (Map.Entry map : empDept.entrySet()){
            System.out.println(map.getKey()+" "+map.getValue());
        }

        //Employee count in each dept
       Map<Integer,Long> empCount= employeeList.stream()
                .collect(Collectors.groupingBy(employee -> employee.getDeptId(),Collectors.counting()));

        empCount.entrySet().forEach(entry -> {
            System.out.println(entry.getKey()+" "+entry.getValue());
        });

        //Active and Inactive employees
      long activeCount = employeeList.stream().filter(
              employee -> employee.getStatus().equalsIgnoreCase("active")
      ).count();

        long inactiveCount = employeeList.stream().filter(
                employee -> employee.getStatus().equalsIgnoreCase("inactive")
        ).count();

        System.out.println("Active : "+activeCount+"   Inactive : "+inactiveCount);

        //Max & Min salary of an employee
        Optional<Employee> maxSalary = employeeList.stream().max(Comparator.comparing(Employee::getSalary));
        Optional<Employee> minSalary = employeeList.stream().min(Comparator.comparing(Employee::getSalary));

        System.out.println("Max salary : "+maxSalary+" Min salary : "+minSalary);

        //Max salary of an employee from each dept
        Map<Integer,Optional<Employee>> topSalaryDept = employeeList.stream().collect(
                Collectors.groupingBy(
                        employee -> employee.getDeptId(),
                        Collectors.maxBy(Comparator.comparing(Employee::getSalary)
                        ))
        );

        topSalaryDept.entrySet().forEach(entry -> {
            System.out.println(entry.getKey()+" "+entry.getValue());
        });
    }
}
