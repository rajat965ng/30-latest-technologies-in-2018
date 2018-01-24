package com.design.AbstractFactory;

import com.design.factory.Connection;

public class SecuredSqlConnection extends Connection{

    @Override
    public String getDescription() {
        return "Secured MySql Connection";
    }
}
