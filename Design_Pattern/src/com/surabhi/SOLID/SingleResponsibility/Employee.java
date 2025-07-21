package com.surabhi.SOLID.SingleResponsibility;

public class Employee {
    private String name;
    private int id;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
