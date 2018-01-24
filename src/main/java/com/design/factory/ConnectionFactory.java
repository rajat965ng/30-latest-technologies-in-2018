package com.design.factory;

public class ConnectionFactory implements Factory{

    private String type;

    public ConnectionFactory(String type) {
        this.type = type;
    }

    @Override
    public Connection getConnection() {
        Connection connection = null;
        switch (type){
            case "oracle":
                connection = new OracleConnection();
            break;
            case "mysql":
                connection = new SqlConnection();
            break;
            default:
                return null;
        }

        return connection;
    }
}

