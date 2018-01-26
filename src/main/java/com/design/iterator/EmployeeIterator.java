package com.design.iterator;

import java.util.Iterator;
import java.util.function.Consumer;

public class EmployeeIterator implements Iterator<Employee>{

    private Employee[] employees;
    private int index = 0;

    public EmployeeIterator(Employee[] employees) {
        this.employees = employees;
    }

    @Override
    public boolean hasNext() {
        return index<employees.length?true:false;
    }

    @Override
    public Employee next() {
        return employees[index++];
    }

    @Override
    public void remove() {
        Employee[] employee = new Employee[employees.length-1];
        int counter = 0;
        for (int i=0;i<employees.length;i++){
            if(i!=index-1){
                employee[counter++]=employees[i];
            }
        }
        this.employees = employee;
        --index;
    }

    @Override
    public void forEachRemaining(Consumer<? super Employee> consumer) {

    }
}
