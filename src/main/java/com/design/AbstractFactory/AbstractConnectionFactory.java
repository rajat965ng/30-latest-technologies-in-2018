package com.design.AbstractFactory;

import com.design.factory.Factory;

public abstract class AbstractConnectionFactory {

    protected String type;
    protected String connection;

    public AbstractConnectionFactory(String type,String connection) {
        this.connection = connection;
        this.type = type;
    }

    public abstract Factory getFactory();
}
