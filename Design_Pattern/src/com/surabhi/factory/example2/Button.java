package com.surabhi.factory.example2;

interface Button {
    public void onClick();
}

class HTMLButton implements Button{
    @Override
    public void onClick(){
        System.out.println("Clicking HTML Button");
    }
}

class WindowButton implements Button{
    @Override
    public void onClick(){
        System.out.println("Clicking Window Button");
    }
}

abstract class ButtonFactory{
    abstract Button createButton();
    void render(){
        Button myButton=createButton();
        myButton.onClick();
    }
}

class HTMLButtonFactory extends ButtonFactory{
    Button createButton(){
        return new HTMLButton();
    }
}

class WindowButtonFactory extends ButtonFactory{
    Button createButton(){
        return new WindowButton();
    }
}

class Main{
    public static void main(String[] args) {
        ButtonFactory myButtonFactory;
        myButtonFactory=new HTMLButtonFactory();
        myButtonFactory.render();
    }
}

