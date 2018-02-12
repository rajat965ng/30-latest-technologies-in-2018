package com.j8.ctx;

@FunctionalInterface
interface Converter<F,T>{
    T convert(F from);
}

@FunctionalInterface
interface PersonFactory<P extends Person>{
    P create(String firstName,String lastName);
}

public class ConverterDemo {

    public static void main(String args[]){

        Converter<String,Integer> converter = (from)->Integer.valueOf(from);
        Integer converted = converter.convert("1234");
        System.out.println(converted);

        converter = Integer::valueOf;
        converted = converter.convert("1001");
        System.out.println(converted);

        Something something = new Something();
        Converter<String,String> stringConverter = something::startWith;
        String convertedString = stringConverter.convert("123");
        System.out.println(convertedString);

        PersonFactory<Person> factory = Person::new;
        Person person = factory.create("Lockheed","Martin");
        System.out.println(person);

        Converter<Integer,String> convertedInteger = from -> String.valueOf(from+" , Hello World");
        System.out.println(convertedInteger.convert(123));
    }

}

class Person{
    private String firstName;
    private String lastName;

    public Person(){}

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}

class Something{
    String startWith(String str){
        return String.valueOf(str.charAt(0));
    }
}