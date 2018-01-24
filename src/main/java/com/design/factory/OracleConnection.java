package com.design.factory;

public class OracleConnection extends Connection {

    @Override
    public String getDescription() {
        return "Oracle";
    }
}
