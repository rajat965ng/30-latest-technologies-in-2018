package com.design.factory;

public class FactoryApp {

    public static void main(String args[]){
        Factory factory = new ConnectionFactory("oracle");
        Connection connection = factory.getConnection();
        System.out.println(connection.getDescription());
    }

}
