package com.design.AbstractFactory;

import com.design.factory.ConnectionFactory;
import com.design.factory.Factory;

public class FactoryChooser extends AbstractConnectionFactory{

    public FactoryChooser(String type,String connection) {
        super(type,connection);
    }

    @Override
    public Factory getFactory() {
        Factory factory = null;
        switch (type){
            case "secure":
                factory = new SecuredConnectionFactory(connection);
            break;
            default:
                factory = new ConnectionFactory(connection);
        }
        return factory;
    }
}
