package com.design.iterator;

public class Employee {

    private long empId;
    private String name;
    private int age;

    public Employee(long empId, String name, int age) {
        this.empId = empId;
        this.name = name;
        this.age = age;
    }

    public long getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}