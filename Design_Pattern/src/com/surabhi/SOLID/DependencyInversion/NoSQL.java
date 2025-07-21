package com.surabhi.SOLID.DependencyInversion;

public class NoSQL implements Database{
    @Override
    public void save() {
        System.out.println("Saving data in NoSQL");
    }
}
