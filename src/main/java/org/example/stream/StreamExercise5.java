package org.example.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/*
You have a list of Employee objects containing attributes such as name, age, and department.
Create a method that takes this list as input and returns a stream of Employee objects
who are older than 30 years and work in the "Engineering" department.
*/

public class StreamExercise5 {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John Doe", 35, "Engineering"));
        employees.add(new Employee("Jane Smith", 28, "Marketing"));
        employees.add(new Employee("Michael Johnson", 42, "Engineering"));
        employees.add(new Employee("Emily Davis", 30, "HR"));
        employees.add(new Employee("David Brown", 40, "Finance"));

        Stream<Employee> employeeStream = employees.stream()
                .filter(e -> e.getAge() >= 30)
                .filter(e -> e.getDepartment().equals("Engineering"));

        System.out.println(employeeStream.toList());
    }

}

class Employee {
    private String name;
    private int age;
    private String department;

    public Employee(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", department='" + department + '\'' +
                '}';
    }
    // Constructor, getters, and setters
}
