package com.design.factory;

public class SqlConnection extends Connection{

    @Override
    public String getDescription() {
        return "MySqlConnection";
    }
}
