package com.surabhi.SOLID.DependencyInversionViolation;

public class ShoppingCart {
    MySQL mySQL=new MySQL();//if you want to use noSQL now you will have to make chenges here
    public void checkout(){
        mySQL.save();
    }
}
