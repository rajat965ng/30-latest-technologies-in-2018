package com.design.AbstractFactory;

import com.design.factory.Connection;

public class SecuredOracleConnection extends Connection{

    @Override
    public String getDescription() {
        return "Secured Oracle Connection";
    }
}
