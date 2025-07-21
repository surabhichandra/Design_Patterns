package com.surabhi.SOLID.DependencyInversion;

public class MySQL implements Database{
    @Override
    public void save() {
        System.out.println("Saving data to MySQL");
    }
}
