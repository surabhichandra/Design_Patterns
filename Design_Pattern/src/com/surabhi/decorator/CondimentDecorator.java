package com.surabhi.decorator;

public abstract class CondimentDecorator extends Beverage{
    /*
    Why is getDescription() declared abstract in CondimentDecorator when it is already implemented in Beverage?
    Because CondimentDecorator wants to force all decorators to override it, even though the superclass
     */
    public abstract String getDescription();
}
