package com.design.AbstractFactory;

import com.design.factory.Connection;
import com.design.factory.Factory;

public class SecuredConnectionFactory implements Factory {

    private String type;

    public SecuredConnectionFactory(String type) {
        this.type = type;
    }

    @Override
    public Connection getConnection() {
        Connection connection = null;

        switch (type){
            case "oracle":
                connection = new SecuredOracleConnection();
            break;
            case "mysql":
                connection = new SecuredSqlConnection();
            break;
            default:
                return null;
        }

        return connection;
    }
}
