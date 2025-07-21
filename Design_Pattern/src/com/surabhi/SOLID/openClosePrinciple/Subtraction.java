package com.surabhi.SOLID.openClosePrinciple;

public class Subtraction implements Calculator{
    @Override
    public int Calculate(int a, int b) {
        return a-b;
    }
}
