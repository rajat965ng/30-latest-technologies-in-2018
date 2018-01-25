package com.design.singleton;

public class Database {

    private String name;

    private volatile static Database database;

    private Database(String name) {
        this.name = name;
    }

    public static Database getInstance(String name){
        if(database==null){
            synchronized (Database.class) {
                if (database==null) {
                    database = new Database("Product");
                }
            }
        }
        return database;
    }

    public String getName() {
        return name;
    }
}
