package com.surabhi.SOLID.DependencyInversion;

public class ShoppingCart {
    Database database;

    public ShoppingCart(Database database) {
        this.database = database;
    }

    public void checkout(){
        database.save();
    }
}
