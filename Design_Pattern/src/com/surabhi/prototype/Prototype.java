package com.surabhi.prototype;

import java.util.ArrayList;
import java.util.List;

class Employee implements Cloneable{
    protected String name;
    protected int age;
    List<Integer> list;



    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
        list = new ArrayList<>();
        list.add(1);

    }

    @Override
    public Employee clone() throws CloneNotSupportedException {
        Employee eClone = (Employee) super.clone();
        eClone.list = new ArrayList<>(this.list); //

        return eClone;
    }



}

public class Prototype {
    public static void main(String[] args)  throws CloneNotSupportedException {
        Employee e = new Employee("sadf",234);
        System.out.println(e.name+" "+e.age+" "+e.list);
        Employee e2 = e.clone();
        System.out.println(e2.name+" "+e2.age+" "+e2.list);
        e2.age = 69;
        e2.list.add(2);
        System.out.println(e2.name+" "+e2.age+" "+e2.list);
        System.out.println(e.name+" "+e.age+" "+e.list);




    }
}
