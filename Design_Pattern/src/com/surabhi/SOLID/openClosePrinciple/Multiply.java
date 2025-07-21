package com.surabhi.SOLID.openClosePrinciple;

public class Multiply implements Calculator{
    @Override
    public int Calculate(int a, int b) {
        return a*b;
    }
}
