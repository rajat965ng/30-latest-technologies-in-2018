package com.design.AbstractFactory;

import com.design.factory.Connection;
import com.design.factory.Factory;

public class AbstractFactoryApp {

    public static void main(String args[]){
        AbstractConnectionFactory abstractConnectionFactory = new FactoryChooser("normal","mysql");
        Factory factory = abstractConnectionFactory.getFactory();
        Connection connection = factory.getConnection();
        System.out.println(connection.getDescription());

    }

}
