package knoldus.question16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Employee implements Comparable<Employee> {
    private String name;
    private int id;
    private double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }


    @Override
    public int compareTo(Employee other) {
        return Integer.compare(this.id, other.id);
    }

    public static void main(String[] args) {
        /* Initializing the Employee List */
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Anshika", 1, 50000));
        employeeList.add(new Employee("Riya", 2, 60000));
        employeeList.add(new Employee("Kamaksha", 3, 55000));

        /* Sorting employeeList and Iterating the list */
        Collections.sort(employeeList);
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }

    // Overriding the ToString() method to print the String
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }
}


