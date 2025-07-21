package com.surabhi.SOLID.DependencyInversion;

public class Main {
    public static void main(String[] args) {
        ShoppingCart shoppingCart=new ShoppingCart(new MySQL());
        shoppingCart.checkout();
        ShoppingCart shoppingCart1=new ShoppingCart(new NoSQL());
        shoppingCart1.checkout();
    }
}
