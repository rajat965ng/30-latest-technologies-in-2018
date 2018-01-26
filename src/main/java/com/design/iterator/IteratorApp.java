package com.design.iterator;

public class IteratorApp {

    public static void main(String args[]) throws InterruptedException {
        Employee[] employees = {new Employee(1L,"ABC",23),
                new Employee(2,"XYZ",26),
                new Employee(3,"PQR",27),
                new Employee(4,"LMN",28),
                new Employee(5,"GHI",29)
        };

        EmployeeIterator iterator = new EmployeeIterator(employees);
        while (iterator.hasNext()){
            Employee employee = iterator.next();
            System.out.println(employee);

            if (employee.getEmpId()==1){
                System.out.println("Deleting: "+employee);
                iterator.remove();
            }
            Thread.sleep(2000);
        }
    }

}