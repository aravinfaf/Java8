package compvscompr;

import util.Employee;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableVsComparator {

    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee(101,"aravind",101,"active",2000));
        employeeList.add(new Employee(102,"santhiya",101,"active",3000));
        employeeList.add(new Employee(103,"ragul",102,"active",7000));
        employeeList.add(new Employee(104,"roopa",102,"inactive",4000));
        employeeList.add(new Employee(105,"puppy",101,"active",6000));
        employeeList.add(new Employee(106,"arun",102,"inactive",3000));

        //Using comparable we can sort only one param based
        Collections.sort(employeeList); // Comparable
        System.out.println(employeeList);

        // Using comparator we can call multiple params
        Collections.sort(employeeList,Employee.nameComparator);
        System.out.println(employeeList);

    }
}
