package statistics;

import util.Employee;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StatisticsExample {

    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee(101,"aravind",101,"active",2000));
        employeeList.add(new Employee(102,"santhiya",101,"active",3000));
        employeeList.add(new Employee(103,"ragul",102,"active",7000));
        employeeList.add(new Employee(104,"roopa",102,"inactive",4000));
        employeeList.add(new Employee(105,"puppy",101,"active",6000));
        employeeList.add(new Employee(106,"arun",102,"inactive",3000));

        int min = employeeList.stream().mapToInt(x -> x.getSalary()).summaryStatistics().getMin();
        System.out.println("Min salary "+min);

        int max = employeeList.stream().mapToInt(x -> x.getSalary()).summaryStatistics().getMax();
        System.out.println("Max salary "+max);

        double avg = employeeList.stream().mapToInt(x -> x.getSalary()).summaryStatistics().getAverage();
        System.out.println("Avg salary "+avg);

        long count = employeeList.stream().mapToInt(x -> x.getSalary()).summaryStatistics().getCount();
        System.out.println("Count  "+count);

        List<Integer> empSort = employeeList.stream().map(x ->x.getSalary()).sorted().collect(Collectors.toList());
        System.out.println(empSort);

        List<Integer> secondLowestSalary = employeeList.stream().map(
                x -> x.getSalary()).sorted().skip(1).limit(2).collect(Collectors.toList());
        System.out.println("Second lowest salary "+secondLowestSalary);

        String empNameJoin = employeeList.stream().map(
                x -> x.getEmpName().toUpperCase()
        ).collect(Collectors.joining(","));

        System.out.println("Join "+empNameJoin);
    }
}
