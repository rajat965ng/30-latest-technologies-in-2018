package com.j8.ctx;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class SupplierDemo {

    public static void main(String args[]){
        Supplier<Person> supplier = Person::new;
        System.out.println(supplier.get());

        Consumer<Person> greeting = person -> {
            System.out.println("Hello, "+person.getFirstName());
        };
        greeting.accept(new Person("Lockheed","Martin"));

        Comparator<Person> comparator = (p1,p2) -> p1.getFirstName().compareTo(p2.getFirstName());
        Person p1 = new Person("Microsoft","Inc");
        Person p2 = new Person("Google","India");

        System.out.println(comparator.compare(p1,p2));
        System.out.println(comparator.reversed().compare(p1,p2));

    }

}
