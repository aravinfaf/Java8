package util;

import java.util.Comparator;

public class Employee implements Comparable<Employee>{
    public Employee(int empId, String empName, int deptId, String status, int salary) {
        this.empId = empId;
        this.empName = empName;
        this.deptId = deptId;
        this.status = status;
        this.salary = salary;
    }

    private int empId;
    private String empName;
    private int deptId;
    private String status = "active";
    private int salary;

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public int getDeptId() {
        return deptId;
    }

    public String getStatus() {
        return status;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", deptId=" + deptId +
                ", status='" + status + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee employee) {
        return this.getSalary() - employee.getSalary();
    }

   public static Comparator<Employee> salaryComparator = new Comparator<Employee>() {
        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.getSalary() - o2.getSalary();
        }
    };

    public static Comparator<Employee> nameComparator = new Comparator<Employee>() {
        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.getEmpName().compareTo(o2.getEmpName());
        }
    };
}
