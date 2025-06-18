package com.surabhi.strategy;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart= new ShoppingCart();

        cart.setPaymentStrategy(new CreditCardPayment("1234-5678-9101-1121"));
        cart.checkout(500);

        cart.setPaymentStrategy(new PayPalPayment("user@example.com"));
        cart.checkout(1200);
    }
}
